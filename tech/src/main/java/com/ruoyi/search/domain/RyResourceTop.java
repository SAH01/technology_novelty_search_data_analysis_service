package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目来源对象 ry_resource_top
 *
 * @author reliableyang
 * @date 2023-04-16
 */
public class RyResourceTop extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 项目来源 */
	@Excel(name = "项目来源")
	private String projectsource;

	/** 项目数量 */
	@Excel(name = "项目数量")
	private Long projectNum;

	public void setProjectsource(String projectsource)
	{
		this.projectsource = projectsource;
	}

	public String getProjectsource()
	{
		return projectsource;
	}
	public void setProjectNum(Long projectNum)
	{
		this.projectNum = projectNum;
	}

	public Long getProjectNum()
	{
		return projectNum;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("projectsource", getProjectsource())
				.append("projectNum", getProjectNum())
				.toString();
	}
}
