package com.ruoyi.search.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.search.domain.*;
import com.ruoyi.search.service.IRyIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ruoyi.common.utils.PageUtils.startPage;

/**
 * @author Administrator
 * @date 2023-04-16 10:46
 */
@RestController
@RequestMapping("/search/index")
public class RyIndexController {
	@Autowired
	private IRyIndexService ryIndexService;

	/**
	 * 查询学科TOP列表【柱状图】
	 */
//	@PreAuthorize("@ss.hasPermi('search:index')")
	@GetMapping("/subject/top/{top}")
	public String listTop(@PathVariable("top") Integer top) {
		List<RySubjectTop> list = ryIndexService.selectRySubjectTopList(top);
		System.out.println(list);
		List<String> x_list = new ArrayList<>();
		List<String> y_list = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
		for (RySubjectTop item : list) {
			x_list.add(item.getSubjectarea());
			y_list.add(String.valueOf(item.getProjectNum()));
		}
		map.put("name", x_list);
		map.put("value", y_list);
		// 将Map对象转换为JSON格式
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		// 输出JSON字符串
		System.out.println("学科TOP：\t" + json);
		return json;
	}

	/**
	 * 查询学科LAST列表【柱状图】
	 */
//	@PreAuthorize("@ss.hasPermi('search:index')")
	@GetMapping("/subject/last/{last}")
	public String listLast(@PathVariable("last") Integer last) {
		List<RySubjectTop> list = ryIndexService.selectRySubjectLastList(last);
		System.out.println(list);
		// 处理数据格式
		List<String> x_list = new ArrayList<>();
		List<String> y_list = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
		for (RySubjectTop item : list) {
			x_list.add(item.getSubjectarea());
			y_list.add(String.valueOf(item.getProjectNum()));
		}
		map.put("name", x_list);
		map.put("value", y_list);
		// 将Map对象转换为JSON格式
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		// 输出JSON字符串
		System.out.println("学科LAST：\t" + json);
		return json;
	}

//	@PreAuthorize("@ss.hasPermi('search:index')")
	@GetMapping("/project/source")
	public String listProjectSource() {
		List<RyResourceTop> list = ryIndexService.getProjectSource();
		System.out.println(list);
		// 处理数据格式
		List<String> x_list = new ArrayList<>();
		List<String> y_list = new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
		for (RyResourceTop item : list) {
			x_list.add(String.valueOf(item.getProjectNum()));
			y_list.add(item.getProjectsource());
		}
		map.put("value", x_list);
		map.put("name", y_list);
		// 将Map对象转换为JSON格式
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		// 输出JSON字符串
		System.out.println("项目来源TOP：\t" + json);
		return json;
	}

	/**
	 * 查新目的统计 【环形柱状图】
	 *
	 * @return
	 */
//	@PreAuthorize("@ss.hasPermi('search:index')")
	@GetMapping("/project/aim")
	public List<Map<String, Object>> listProjectAim() {
		List<RyAimTop> list = ryIndexService.getProjectAim();
		System.out.println("查新目的：");
		List<Map<String, Object>> resList = new ArrayList<>();
		for (RyAimTop ryAimTop : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", ryAimTop.getNoveltyretrieval());
			map.put("value", ryAimTop.getProjectNum());
			resList.add(map);
		}
		System.out.println(resList);
		return resList;
	}
	/**
	 * 单位活跃度统计 【玫瑰图】
	 *
	 * @return
	 */
//	@PreAuthorize("@ss.hasPermi('search:index')")
	@GetMapping("/company/top/{top}")
	public List<Map<String, Object>> listCompanyTop(@PathVariable("top") Integer top) {
		List<RyCompanyTop> list = ryIndexService.getCompanyTop(top);
		System.out.println("单位活跃度TOP：");

		List<Map<String, Object>> resList = new ArrayList<>();
		for (RyCompanyTop ryCompanyTop : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", ryCompanyTop.getCompany());
			map.put("value", ryCompanyTop.getProjectNum());
			resList.add(map);
		}
		System.out.println(resList);
		return resList;
	}

	/**
	 * 地域活跃度统计 【饼图】
	 *
	 * @return
	 */
//	@PreAuthorize("@ss.hasPermi('search:index')")
	@GetMapping("/region/top/{top}")
	public List<Map<String, Object>> listRegionTop(@PathVariable("top") Integer top) {
		List<RyRegionSum> list = ryIndexService.getRegionTop(top);
		System.out.println("地域活跃度TOP：");

		List<Map<String, Object>> resList = new ArrayList<>();
		for (RyRegionSum ryRegionSum : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", ryRegionSum.getProvince());
			map.put("value", ryRegionSum.getProjectNum());
			resList.add(map);
		}
		System.out.println(resList);
		return resList;
	}
}