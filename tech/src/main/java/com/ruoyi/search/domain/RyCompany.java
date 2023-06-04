package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单位分析对象 ry_company
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public class RyCompany extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 委托人单位 */
    @Excel(name = "委托人单位")
    private String company;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 通讯地址 */
    @Excel(name = "通讯地址")
    private String postaladdress;

    /** 企业性质 */
    @Excel(name = "企业性质")
    private String enterprise;

    /** 项目数量 */
    @Excel(name = "项目数量")
    private Long projectNum;

    /** 年份 */
    @Excel(name = "年份")
    private String year;

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
    public void setPostaladdress(String postaladdress) 
    {
        this.postaladdress = postaladdress;
    }

    public String getPostaladdress() 
    {
        return postaladdress;
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
    public void setYear(String year) 
    {
        this.year = year;
    }

    public String getYear() 
    {
        return year;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("company", getCompany())
            .append("province", getProvince())
            .append("postaladdress", getPostaladdress())
            .append("enterprise", getEnterprise())
            .append("projectNum", getProjectNum())
            .append("year", getYear())
            .toString();
    }
}
