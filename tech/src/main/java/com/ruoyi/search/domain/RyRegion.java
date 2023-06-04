package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地域分析对象 ry_region
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public class RyRegion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

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
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
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
            .append("province", getProvince())
            .append("projectNum", getProjectNum())
            .append("year", getYear())
            .toString();
    }
}
