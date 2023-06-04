package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单位活跃度对象 ry_company_top
 *
 * @author reliableyang
 * @date 2023-04-16
 */
public class RyCompanyTop extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** ID */
	private Integer id;

	/** 委托人单位 */
	@Excel(name = "委托人单位")
	private String company;

	/** 省份代码 */
	@Excel(name = "省份代码")
	private String province;

	/** 企业性质 */
	@Excel(name = "企业性质")
	private String enterprise;

	/** 项目数量 */
	@Excel(name = "项目数量")
	private Long projectNum;

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId()
	{
		return id;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}

	public String getCompany()
	{
		return company;
	}
	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getProvince()
	{
		return province;
	}
	public void setEnterprise(String enterprise)
	{
		this.enterprise = enterprise;
	}

	public String getEnterprise()
	{
		return enterprise;
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
				.append("id", getId())
				.append("company", getCompany())
				.append("province", getProvince())
				.append("enterprise", getEnterprise())
				.append("projectNum", getProjectNum())
				.toString();
	}
}
