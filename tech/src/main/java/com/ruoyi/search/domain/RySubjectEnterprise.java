package com.ruoyi.search.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单位学科领域
 */
public class RySubjectEnterprise extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 学科领域 */
	@Excel(name = "企业性质")
	private String enterprise;

	/** $column.columnComment */
	@Excel(name = "项目数量", readConverterExp = "$column.readConverterExp()")
	private Long projectNum;

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public Long getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(Long projectNum) {
		this.projectNum = projectNum;
	}

	@Override
	public String toString() {
		return "RySubjectEnterprise{" +
				"enterprise='" + enterprise + '\'' +
				", projectNum=" + projectNum +
				'}';
	}
}
