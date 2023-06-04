package com.ruoyi.search.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 查新目的对象 ry_aim_top
 *
 * @author reliableyang
 * @date 2023-04-16
 */
public class RyAimTop extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	/** 查新目的 */
	@Excel(name = "查新目的")
	private String noveltyretrieval;

	/** $column.columnComment */
	@Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
	private Long projectNum;

	public void setNoveltyretrieval(String noveltyretrieval)
	{
		this.noveltyretrieval = noveltyretrieval;
	}

	public String getNoveltyretrieval()
	{
		return noveltyretrieval;
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
				.append("noveltyretrieval", getNoveltyretrieval())
				.append("projectNum", getProjectNum())
				.toString();
	}
}
