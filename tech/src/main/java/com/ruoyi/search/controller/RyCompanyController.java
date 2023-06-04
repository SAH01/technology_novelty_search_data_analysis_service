package com.ruoyi.search.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.search.domain.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.search.service.IRyCompanyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 单位分析Controller
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/search/company")
public class RyCompanyController extends BaseController
{
    @Autowired
    private IRyCompanyService ryCompanyService;

    /**
     * 【雷达图】 单位学科领域分布
     * @param company
     * @return
     */
    @GetMapping("/subject/{company}/{year}")
    public String listSubjectNum(@PathVariable("company") String company,@PathVariable("year") String year) {
        if(year.equals("2099")){
            year = "";
        }
        List<RyCompanySubject> list = ryCompanyService.getCompanySubjectNum(company,year);
        // 数据格式 一个数组存map {name:'xxx'} 另一个数据存所有的数量

        Map<String, Object> res_map = new HashMap<String, Object>();
        List<String> num_list = new ArrayList<>();
        List<Integer> num_list_max = new ArrayList<>();
        Integer max = null;
        double tempNum = 0;
        List<Map<String, Object>> subject_list = new ArrayList<>();
        // 找出雷达图的最大值
        for (RyCompanySubject item : list) {
            num_list_max.add(Math.toIntExact(item.getProjectNum()));
        }
        max = RyCompanyController.findMax(num_list_max);
        tempNum = Math.floor(max * 0.1);
        max = max + new Integer((int) tempNum); // 最大值处理 为了让图更好看
        for (RyCompanySubject item : list) {
            Map<String, Object> subject_map = new HashMap<String, Object>();
            num_list.add(String.valueOf(item.getProjectNum()));
            subject_map.put("name",item.getSubjectArea());
            subject_map.put("max",String.valueOf(max));
            subject_list.add(subject_map);
        }
        res_map.put("name",subject_list);
        res_map.put("value",num_list);

        // 将Map对象转换为JSON格式
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(res_map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        // 输出JSON字符串
        System.out.println(company+"学科领域(研究方向)TOP：\t" + json);
        return json;
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);  // 假设List中第一个元素为最大值
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {  // 如果当前元素比最大值大，则更新最大值
                max = list.get(i);
            }
        }
        return max;
    }

    /**
     * 【折线图】某单位 各年份 的项目数
     * @param company
     * @return
     */
    @GetMapping("/year/{company}")
    public String listYearNum(@PathVariable("company") String company) {
        List<RyCompanyYear> list = ryCompanyService.getCompanyYearNum(company);
        // 处理数据格式
        List<String> x_list = new ArrayList<>();
        List<String> y_list = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        for (RyCompanyYear item : list) {
            x_list.add(item.getYears());
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
        System.out.println("某单位各年份项目数（折线图）：\t" + json);
        return json;
    }

    /**
     * 查询单位分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:company:list')")
    @GetMapping("/list")
    public TableDataInfo list(RyCompany ryCompany)
    {
        startPage();
        List<RyCompany> list = ryCompanyService.selectRyCompanyList(ryCompany);
        return getDataTable(list);
    }

    /**
     * 导出单位分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:company:export')")
    @Log(title = "单位分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RyCompany ryCompany)
    {
        List<RyCompany> list = ryCompanyService.selectRyCompanyList(ryCompany);
        ExcelUtil<RyCompany> util = new ExcelUtil<RyCompany>(RyCompany.class);
        util.exportExcel(response, list, "单位分析数据");
    }

    /**
     * 获取单位分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('search:company:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(ryCompanyService.selectRyCompanyById(id));
    }

    /**
     * 新增单位分析
     */
    @PreAuthorize("@ss.hasPermi('search:company:add')")
    @Log(title = "单位分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RyCompany ryCompany)
    {
        return toAjax(ryCompanyService.insertRyCompany(ryCompany));
    }

    /**
     * 修改单位分析
     */
    @PreAuthorize("@ss.hasPermi('search:company:edit')")
    @Log(title = "单位分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RyCompany ryCompany)
    {
        return toAjax(ryCompanyService.updateRyCompany(ryCompany));
    }

    /**
     * 删除单位分析
     */
    @PreAuthorize("@ss.hasPermi('search:company:remove')")
    @Log(title = "单位分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(ryCompanyService.deleteRyCompanyByIds(ids));
    }
}
