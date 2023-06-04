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
import com.ruoyi.search.service.IRySubjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学科分析Controller
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/search/subject")
public class RySubjectController extends BaseController
{
    @Autowired
    private IRySubjectService rySubjectService;

    /**
     * 【雷达图】 单位学科领域分布
     * @param enterprise
     * @return
     */
    @GetMapping("/enterprise/{enterprise}/{year}")
    public String listSubjectNum(@PathVariable("enterprise") String enterprise,
                                 @PathVariable("year") String year) {
        if(year.equals("2099")){
            year = "";
        }
        List<RySubjectEnterprise> list = rySubjectService.getSubjectEnterpriseNum(enterprise,year);
        // 数据格式 一个数组存map {name:'xxx'} 另一个数据存所有的数量

        Map<String, Object> res_map = new HashMap<String, Object>();
        List<String> num_list = new ArrayList<>();
        List<Integer> num_list_max = new ArrayList<>();
        Integer max = null;
        double tempNum = 0;
        List<Map<String, Object>> subject_list = new ArrayList<>();
        // 找出雷达图的最大值
        for (RySubjectEnterprise item : list) {
            num_list_max.add(Math.toIntExact(item.getProjectNum()));
        }
        max = RyCompanyController.findMax(num_list_max);
        tempNum = Math.floor(max * 0.1);
        max = max + new Integer((int) tempNum); // 最大值处理 为了让图更好看
        for (RySubjectEnterprise item : list) {
            Map<String, Object> subject_map = new HashMap<String, Object>();
            num_list.add(String.valueOf(item.getProjectNum()));
            subject_map.put("name",item.getEnterprise());
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
        System.out.println(enterprise+" 学科领域(研究方向)TOP：\t" + json);
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
     * @param subject
     * @return
     */
    @GetMapping("/year/{subject}")
    public String listYearNum(@PathVariable("subject") String subject) {
        List<RySubjectYear> list = rySubjectService.getSubjectYearNum(subject);
        // 处理数据格式
        List<String> x_list = new ArrayList<>();
        List<String> y_list = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        for (RySubjectYear item : list) {
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
        System.out.println("某学科领域各年份项目数（折线图）：\t" + json);
        return json;
    }

    /**
     * 查询学科分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:subject:list')")
    @GetMapping("/list")
    public TableDataInfo list(RySubject rySubject)
    {
        startPage();
        List<RySubject> list = rySubjectService.selectRySubjectList(rySubject);
        return getDataTable(list);
    }

    /**
     * 导出学科分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:subject:export')")
    @Log(title = "学科分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RySubject rySubject)
    {
        List<RySubject> list = rySubjectService.selectRySubjectList(rySubject);
        ExcelUtil<RySubject> util = new ExcelUtil<RySubject>(RySubject.class);
        util.exportExcel(response, list, "学科分析数据");
    }

    /**
     * 获取学科分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('search:subject:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(rySubjectService.selectRySubjectById(id));
    }

    /**
     * 新增学科分析
     */
    @PreAuthorize("@ss.hasPermi('search:subject:add')")
    @Log(title = "学科分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RySubject rySubject)
    {
        return toAjax(rySubjectService.insertRySubject(rySubject));
    }

    /**
     * 修改学科分析
     */
    @PreAuthorize("@ss.hasPermi('search:subject:edit')")
    @Log(title = "学科分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RySubject rySubject)
    {
        return toAjax(rySubjectService.updateRySubject(rySubject));
    }

    /**
     * 删除学科分析
     */
    @PreAuthorize("@ss.hasPermi('search:subject:remove')")
    @Log(title = "学科分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(rySubjectService.deleteRySubjectByIds(ids));
    }
}
