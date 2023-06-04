package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学科TOP对象 ry_subject_top
 *
 * @author reliableyang
 * @date 2023-04-16
 */
public class RySubjectTop extends BaseEntity
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

	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("id", getId())
				.append("subjectarea", getSubjectarea())
				.append("classificationnumber", getClassificationnumber())
				.append("projectNum", getProjectNum())
				.toString();
	}
}
