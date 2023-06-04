package com.ruoyi.search.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单位学科领域
 */
public class RyCompanySubject extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 学科领域 */
	@Excel(name = "学科领域")
	private String subjectArea;

	/** $column.columnComment */
	@Excel(name = "项目数量", readConverterExp = "$column.readConverterExp()")
	private Long projectNum;

	public String getSubjectArea() {
		return subjectArea;
	}

	public void setSubjectArea(String subjectArea) {
		this.subjectArea = subjectArea;
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
				"subjectArea='" + subjectArea + '\'' +
				", projectNum=" + projectNum +
				'}';
	}
}
