package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学科分析对象 ry_subject
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public class RySubject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 学科领域 */
    @Excel(name = "学科领域")
    private String subjectarea;

    /** 分类号 */
    @Excel(name = "分类号")
    private String classificationnumber;

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
    public void setSubjectarea(String subjectarea) 
    {
        this.subjectarea = subjectarea;
    }

    public String getSubjectarea() 
    {
        return subjectarea;
    }
    public void setClassificationnumber(String classificationnumber) 
    {
        this.classificationnumber = classificationnumber;
    }

    public String getClassificationnumber() 
    {
        return classificationnumber;
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
            .append("subjectarea", getSubjectarea())
            .append("classificationnumber", getClassificationnumber())
            .append("projectNum", getProjectNum())
            .append("year", getYear())
            .toString();
    }
}
