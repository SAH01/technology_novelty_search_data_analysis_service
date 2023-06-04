package com.ruoyi.search.service;

import com.ruoyi.search.domain.*;

import java.util.List;

/**
 * @BelongsProject: ruoyi
 * @BelongsPackage: com.ruoyi.search.service
 * @Author: Administrator
 * @CreateTime: 2023-04-16 11:00
 * @Description:
 */
public interface IRyIndexService {
	// 首页学科TOP5
	public List<RySubjectTop> selectRySubjectTopList(Integer top);
	// 首页学科LAST5
	public List<RySubjectTop> selectRySubjectLastList(Integer last);
	// 首页项目来源TOP20
	public List<RyResourceTop> getProjectSource();
	// 首页查新目的 饼图
	public List<RyAimTop> getProjectAim();
	// 首页单位活跃度 玫瑰饼图
	public List<RyCompanyTop> getCompanyTop(Integer top);
	// 首页地域活跃度 饼图
	public List<RyRegionSum> getRegionTop(Integer top);
}
