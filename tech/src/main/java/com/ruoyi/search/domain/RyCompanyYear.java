package com.ruoyi.search.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class RyCompanyYear extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 查新目的 */
	@Excel(name = "年份")
	private String years;

	/** $column.columnComment */
	@Excel(name = "项目数量", readConverterExp = "$column.readConverterExp()")
	private Long projectNum;

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public Long getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(Long projectNum) {
		this.projectNum = projectNum;
	}

	@Override
	public String toString() {
		return "RyCompanyYear{" +
				"years='" + years + '\'' +
				", projectNum=" + projectNum +
				'}';
	}
}
