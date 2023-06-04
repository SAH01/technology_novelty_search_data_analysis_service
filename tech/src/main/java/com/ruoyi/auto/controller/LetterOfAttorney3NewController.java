package com.ruoyi.auto.controller;

import java.util.List;
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
import com.ruoyi.auto.domain.LetterOfAttorney3New;
import com.ruoyi.auto.service.ILetterOfAttorney3NewService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分类检索Controller
 * 
 * @author reliableyang
 * @date 2023-04-16
 */
@RestController
@RequestMapping("/auto/autoQuery")
public class LetterOfAttorney3NewController extends BaseController
{
    @Autowired
    private ILetterOfAttorney3NewService letterOfAttorney3NewService;

    /**
     * 查询分类检索列表
     */
    @PreAuthorize("@ss.hasPermi('auto:autoQuery:list')")
    @GetMapping("/list")
    public TableDataInfo list(LetterOfAttorney3New letterOfAttorney3New)
    {
        startPage();
        List<LetterOfAttorney3New> list = letterOfAttorney3NewService.selectLetterOfAttorney3NewList(letterOfAttorney3New);
        return getDataTable(list);
    }

    /**
     * 导出分类检索列表
     */
    @PreAuthorize("@ss.hasPermi('auto:autoQuery:export')")
    @Log(title = "分类检索", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LetterOfAttorney3New letterOfAttorney3New)
    {
        List<LetterOfAttorney3New> list = letterOfAttorney3NewService.selectLetterOfAttorney3NewList(letterOfAttorney3New);
        ExcelUtil<LetterOfAttorney3New> util = new ExcelUtil<LetterOfAttorney3New>(LetterOfAttorney3New.class);
        util.exportExcel(response, list, "分类检索数据");
    }

    /**
     * 获取分类检索详细信息
     */
    @PreAuthorize("@ss.hasPermi('auto:autoQuery:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(letterOfAttorney3NewService.selectLetterOfAttorney3NewById(id));
    }

    /**
     * 新增分类检索
     */
    @PreAuthorize("@ss.hasPermi('auto:autoQuery:add')")
    @Log(title = "分类检索", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LetterOfAttorney3New letterOfAttorney3New)
    {
        return toAjax(letterOfAttorney3NewService.insertLetterOfAttorney3New(letterOfAttorney3New));
    }

    /**
     * 修改分类检索
     */
    @PreAuthorize("@ss.hasPermi('auto:autoQuery:edit')")
    @Log(title = "分类检索", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LetterOfAttorney3New letterOfAttorney3New)
    {
        return toAjax(letterOfAttorney3NewService.updateLetterOfAttorney3New(letterOfAttorney3New));
    }

    /**
     * 删除分类检索
     */
    @PreAuthorize("@ss.hasPermi('auto:autoQuery:remove')")
    @Log(title = "分类检索", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(letterOfAttorney3NewService.deleteLetterOfAttorney3NewByIds(ids));
    }
}
