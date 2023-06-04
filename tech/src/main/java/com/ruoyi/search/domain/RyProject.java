package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目分析对象 ry_project
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public class RyProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String entrynamez;

    /** 学科领域 */
    @Excel(name = "学科领域")
    private String subjectarea;

    /** 委托人单位 */
    @Excel(name = "委托人单位")
    private String company;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 项目来源 */
    @Excel(name = "项目来源")
    private String projectsource;

    /** 查新目的 */
    @Excel(name = "查新目的")
    private String noveltyretrieval;

    /** 关键词 */
    @Excel(name = "关键词")
    private String keyword;

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
    public void setEntrynamez(String entrynamez) 
    {
        this.entrynamez = entrynamez;
    }

    public String getEntrynamez() 
    {
        return entrynamez;
    }
    public void setSubjectarea(String subjectarea) 
    {
        this.subjectarea = subjectarea;
    }

    public String getSubjectarea() 
    {
        return subjectarea;
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
    public void setProjectsource(String projectsource) 
    {
        this.projectsource = projectsource;
    }

    public String getProjectsource() 
    {
        return projectsource;
    }
    public void setNoveltyretrieval(String noveltyretrieval) 
    {
        this.noveltyretrieval = noveltyretrieval;
    }

    public String getNoveltyretrieval() 
    {
        return noveltyretrieval;
    }
    public void setKeyword(String keyword) 
    {
        this.keyword = keyword;
    }

    public String getKeyword() 
    {
        return keyword;
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
            .append("entrynamez", getEntrynamez())
            .append("subjectarea", getSubjectarea())
            .append("company", getCompany())
            .append("province", getProvince())
            .append("projectsource", getProjectsource())
            .append("noveltyretrieval", getNoveltyretrieval())
            .append("keyword", getKeyword())
            .append("year", getYear())
            .toString();
    }
}
