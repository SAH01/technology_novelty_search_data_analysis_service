package com.ruoyi.search.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.search.domain.RyProject;
import com.ruoyi.search.service.IRyProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目分析Controller
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@RestController
@RequestMapping("/search/project")
public class RyProjectController extends BaseController
{
    @Autowired
    private IRyProjectService ryProjectService;

    /**
     * 查询项目分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(RyProject ryProject)
    {
        startPage();
        List<RyProject> list = ryProjectService.selectRyProjectList(ryProject);
        return getDataTable(list);
    }

    /**
     * 导出项目分析列表
     */
    @PreAuthorize("@ss.hasPermi('search:project:export')")
    @Log(title = "项目分析", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RyProject ryProject)
    {
        List<RyProject> list = ryProjectService.selectRyProjectList(ryProject);
        ExcelUtil<RyProject> util = new ExcelUtil<RyProject>(RyProject.class);
        util.exportExcel(response, list, "项目分析数据");
    }

    /**
     * 获取项目分析详细信息
     */
    @PreAuthorize("@ss.hasPermi('search:project:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(ryProjectService.selectRyProjectById(id));
    }

    /**
     * 查询 By 单位
     * @param company
     * @return
     */
    @PreAuthorize("@ss.hasPermi('search:project:query')")
    @GetMapping("/company/{company}/{year}")
    public TableDataInfo getInfoByCompany(@PathVariable("company") String company,@PathVariable("year") String year)
    {
        List<RyProject> list = new ArrayList<RyProject>();
        if(year.equals("2099")){
            System.out.println("year为2099：\t "+company+" "+year);
            startPage();
            list = ryProjectService.selectRyProjectByCompany(company);
        }else{
            System.out.println("year不为null：\t "+company+" "+year);
            startPage();
            list = ryProjectService.selectRyProjectByCompanyAndYear(company,year);
        }
        return getDataTable(list);
    }

    /**
     * 查询 By 省份
     * @param province
     * @return
     */
    @PreAuthorize("@ss.hasPermi('search:project:query')")
    @GetMapping("/province/{province}/{year}")
    public TableDataInfo getInfoByProvince(@PathVariable("province") String province,@PathVariable("year") String year)
    {

        List<RyProject> list = new ArrayList<RyProject>();
        if(year.equals("2099")){
            System.out.println("year为2099：\t "+province+" "+year);
            startPage();
            list = ryProjectService.selectRyProjectByProvince(province);
        }else{
            System.out.println("year不为null：\t "+province+" "+year);
            startPage();
            list = ryProjectService.selectRyProjectByProvinceAndYear(province,year);
        }
        return getDataTable(list);

    }

    /**
     * 查询 By 学科
     * @param subject
     * @return
     */
    @PreAuthorize("@ss.hasPermi('search:project:query')")
    @GetMapping("/subject/{subject}/{year}")
    public TableDataInfo getInfoBySubject(@PathVariable("subject") String subject,
                                          @PathVariable("year") String year)
    {
        List<RyProject> list = new ArrayList<RyProject>();
        if(year.equals("2099")){
            System.out.println("year为2099：\t "+subject+" "+year);
            startPage();
            list = ryProjectService.selectRyProjectBySubject(subject);
        }else{
            System.out.println("year不为null：\t "+subject+" "+year);
            startPage();
            list = ryProjectService.selectRyProjectBySubjectAndYear(subject,year);
        }
        return getDataTable(list);
    }

    /**
     * 新增项目分析
     */
    @PreAuthorize("@ss.hasPermi('search:project:add')")
    @Log(title = "项目分析", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RyProject ryProject)
    {
        return toAjax(ryProjectService.insertRyProject(ryProject));
    }

    /**
     * 修改项目分析
     */
    @PreAuthorize("@ss.hasPermi('search:project:edit')")
    @Log(title = "项目分析", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RyProject ryProject)
    {
        return toAjax(ryProjectService.updateRyProject(ryProject));
    }

    /**
     * 删除项目分析
     */
    @PreAuthorize("@ss.hasPermi('search:project:remove')")
    @Log(title = "项目分析", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(ryProjectService.deleteRyProjectByIds(ids));
    }
}
