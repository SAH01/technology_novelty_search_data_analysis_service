package com.ruoyi.search.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.security.auth.Subject;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruoyi.search.domain.RyCompanySubject;
import com.ruoyi.search.domain.RyRegionSubject;
import com.ruoyi.search.domain.RySubjectTop;
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
import com.ruoyi.search.domain.RyRegion;
import com.ruoyi.search.service.IRyRegionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 地域分析Controller
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/search/region")
public class RyRegionController extends BaseController
{
    @Autowired
    private IRyRegionService ryRegionService;
    /**
     * 【柱状图】 地域学科领域分布
     * @param province
     * @return
     */
    @GetMapping("/subject/{province}/{year}")
    public String listSubjectNum(@PathVariable("province") String province,@PathVariable("year") String year) {
        if(year.equals("2099")){
            year = "";
        }
        List<RyRegionSubject> list = ryRegionService.getRegionSubjectNum(province,year);
//        System.out.println(list);
        List<String> x_list = new ArrayList<>();
        List<String> y_list = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        for (RyRegionSubject item : list) {
            x_list.add(item.getSubjectArea());
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
        System.out.println("地域学科分布【柱状图】：\t" + json);
        return json;
    }
    /**
     * 查询地域分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:region:list')")
    @GetMapping("/list")
    public TableDataInfo list(RyRegion ryRegion)
    {
        startPage();
        List<RyRegion> list = ryRegionService.selectRyRegionList(ryRegion);
        return getDataTable(list);
    }

    /**
     * 导出地域分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:region:export')")
    @Log(title = "地域分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RyRegion ryRegion)
    {
        List<RyRegion> list = ryRegionService.selectRyRegionList(ryRegion);
        ExcelUtil<RyRegion> util = new ExcelUtil<RyRegion>(RyRegion.class);
        util.exportExcel(response, list, "地域分析数据");
    }

    /**
     * 获取地域分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('search:region:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(ryRegionService.selectRyRegionById(id));
    }

    /**
     * 新增地域分析
     */
    @PreAuthorize("@ss.hasPermi('search:region:add')")
    @Log(title = "地域分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RyRegion ryRegion)
    {
        return toAjax(ryRegionService.insertRyRegion(ryRegion));
    }

    /**
     * 修改地域分析
     */
    @PreAuthorize("@ss.hasPermi('search:region:edit')")
    @Log(title = "地域分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RyRegion ryRegion)
    {
        return toAjax(ryRegionService.updateRyRegion(ryRegion));
    }

    /**
     * 删除地域分析
     */
    @PreAuthorize("@ss.hasPermi('search:region:remove')")
    @Log(title = "地域分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(ryRegionService.deleteRyRegionByIds(ids));
    }
}
