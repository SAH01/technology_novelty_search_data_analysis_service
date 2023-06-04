package com.ruoyi.auto.controller;

import com.ruoyi.auto.domain.RyRegionMap;
import com.ruoyi.auto.service.IRyMapService;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @date 2023-04-16 21:25
 */
@RestController
@RequestMapping("/auto/visual")
public class VisualController extends BaseController {
	@Autowired
	private IRyMapService ryMapService;
	@GetMapping("/map")
	public List<Map<String, Object>> listProjectAim() {
		List<RyRegionMap> list = ryMapService.getRegionMap();
		System.out.println("地图：");

		List<Map<String, Object>> resList = new ArrayList<>();
		for (RyRegionMap ryRegionMap : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", ryRegionMap.getProvince());
			map.put("value", ryRegionMap.getProjectNum());
			resList.add(map);
		}
		System.out.println(resList);
		return resList;
	}
}