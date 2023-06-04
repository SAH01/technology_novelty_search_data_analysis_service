package com.ruoyi.search.mapper;

import com.ruoyi.search.domain.*;

import java.util.List;

/**
 * @BelongsProject: ruoyi
 * @BelongsPackage: com.ruoyi.search.mapper
 * @Author: Administrator
 * @CreateTime: 2023-04-16 11:02
 * @Description:
 */
public interface RyIndexMapper {
	public List<RySubjectTop> getSubjectTop(Integer top);
	public List<RySubjectTop> getSubjectLast(Integer last);
	public List<RyResourceTop> getProjectSource();
	public List<RyAimTop> getProjectAim();
	public List<RyCompanyTop> getCompanyTop(Integer top);
	public List<RyRegionSum> getRegionTop(Integer top);
}
