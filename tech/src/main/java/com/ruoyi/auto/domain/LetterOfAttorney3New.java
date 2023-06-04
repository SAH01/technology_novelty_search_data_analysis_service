package com.ruoyi.auto.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分类检索对象 letter_of_attorney_3_new
 * 
 * @author reliableyang
 * @date 2023-04-16
 */
public class LetterOfAttorney3New extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;

    /** 查新项目名称中文 */
    @Excel(name = "查新项目名称中文")
    private String entrynamez;

    /** 查新项目名英文 */
    private String entrynamey;

    /** 委托人单位 */
    @Excel(name = "委托人单位")
    private String company;

    /** 通讯地址 */
    private String postaladdress;

    /** 项目来源 */
    private String projectsource;

    /** 查新目的二级 */
    private String noveltyretrievalxin;

    /** 查新目的 */
    @Excel(name = "查新目的")
    private String noveltyretrieval;

    /** 查新范围 */
    private String noveltyrange;

    /** 学科领域 */
    @Excel(name = "学科领域")
    private String subjectarea;

    /** 项目科学技术要点 */
    private String technicalpoints;

    /** 查新点 */
    @Excel(name = "查新点")
    private String spot;

    /** 检索词中文 */
    private String retrievalz;

    /** 检索词英文 */
    private String retrievaly;

    /** 项目编号 */
    private String projectnumber;

    /** 报告名称 */
    private String nameofthereport;

    /** 手填的项目来源 */
    private String projectsourcecontent;

    /** 手填的查新目的 */
    private String objectivecontent;

    /** 企业性质 */
    private String enterprise;

    /** 企业性质二级 */
    private String enterprise1;

    /** 报告类型1、查新，2、查重，3、检索 */
    private Integer type;

    /** 查重论文或书稿是否已发布 */
    private String releaseornot;

    /** 查重论文或书稿发布日期 */
    private String releasedate;

    /** 年份 */
    @Excel(name = "年份")
    private String year;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 市代码 */
    private String city;

    /** 区县代码 */
    private String area;

    /** 查新点分词结果 */
    private String spotsplit;

    /** 项目类型 */
    private String projecttype;

    /** 分类号 */
    private String classificationnumber;

    /** 关键词 */
    @Excel(name = "关键词")
    private String keyword;

    /** 检索式 */
    private String retrievaltype;

    /** 任务编号 */
    private Long taskid;

    /** 查新结论原文 */
    private String searchconclusion;

    /** 项目链接 */
    @Excel(name = "项目链接")
    private String sourceurl;

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
    public void setEntrynamey(String entrynamey) 
    {
        this.entrynamey = entrynamey;
    }

    public String getEntrynamey() 
    {
        return entrynamey;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setPostaladdress(String postaladdress) 
    {
        this.postaladdress = postaladdress;
    }

    public String getPostaladdress() 
    {
        return postaladdress;
    }
    public void setProjectsource(String projectsource) 
    {
        this.projectsource = projectsource;
    }

    public String getProjectsource() 
    {
        return projectsource;
    }
    public void setNoveltyretrievalxin(String noveltyretrievalxin) 
    {
        this.noveltyretrievalxin = noveltyretrievalxin;
    }

    public String getNoveltyretrievalxin() 
    {
        return noveltyretrievalxin;
    }
    public void setNoveltyretrieval(String noveltyretrieval) 
    {
        this.noveltyretrieval = noveltyretrieval;
    }

    public String getNoveltyretrieval() 
    {
        return noveltyretrieval;
    }
    public void setNoveltyrange(String noveltyrange) 
    {
        this.noveltyrange = noveltyrange;
    }

    public String getNoveltyrange() 
    {
        return noveltyrange;
    }
    public void setSubjectarea(String subjectarea) 
    {
        this.subjectarea = subjectarea;
    }

    public String getSubjectarea() 
    {
        return subjectarea;
    }
    public void setTechnicalpoints(String technicalpoints) 
    {
        this.technicalpoints = technicalpoints;
    }

    public String getTechnicalpoints() 
    {
        return technicalpoints;
    }
    public void setSpot(String spot) 
    {
        this.spot = spot;
    }

    public String getSpot() 
    {
        return spot;
    }
    public void setRetrievalz(String retrievalz) 
    {
        this.retrievalz = retrievalz;
    }

    public String getRetrievalz() 
    {
        return retrievalz;
    }
    public void setRetrievaly(String retrievaly) 
    {
        this.retrievaly = retrievaly;
    }

    public String getRetrievaly() 
    {
        return retrievaly;
    }
    public void setProjectnumber(String projectnumber) 
    {
        this.projectnumber = projectnumber;
    }

    public String getProjectnumber() 
    {
        return projectnumber;
    }
    public void setNameofthereport(String nameofthereport) 
    {
        this.nameofthereport = nameofthereport;
    }

    public String getNameofthereport() 
    {
        return nameofthereport;
    }
    public void setProjectsourcecontent(String projectsourcecontent) 
    {
        this.projectsourcecontent = projectsourcecontent;
    }

    public String getProjectsourcecontent() 
    {
        return projectsourcecontent;
    }
    public void setObjectivecontent(String objectivecontent) 
    {
        this.objectivecontent = objectivecontent;
    }

    public String getObjectivecontent() 
    {
        return objectivecontent;
    }
    public void setEnterprise(String enterprise) 
    {
        this.enterprise = enterprise;
    }

    public String getEnterprise() 
    {
        return enterprise;
    }
    public void setEnterprise1(String enterprise1) 
    {
        this.enterprise1 = enterprise1;
    }

    public String getEnterprise1() 
    {
        return enterprise1;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setReleaseornot(String releaseornot) 
    {
        this.releaseornot = releaseornot;
    }

    public String getReleaseornot() 
    {
        return releaseornot;
    }
    public void setReleasedate(String releasedate) 
    {
        this.releasedate = releasedate;
    }

    public String getReleasedate() 
    {
        return releasedate;
    }
    public void setYear(String year) 
    {
        this.year = year;
    }

    public String getYear() 
    {
        return year;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setSpotsplit(String spotsplit) 
    {
        this.spotsplit = spotsplit;
    }

    public String getSpotsplit() 
    {
        return spotsplit;
    }
    public void setProjecttype(String projecttype) 
    {
        this.projecttype = projecttype;
    }

    public String getProjecttype() 
    {
        return projecttype;
    }
    public void setClassificationnumber(String classificationnumber) 
    {
        this.classificationnumber = classificationnumber;
    }

    public String getClassificationnumber() 
    {
        return classificationnumber;
    }
    public void setKeyword(String keyword) 
    {
        this.keyword = keyword;
    }

    public String getKeyword() 
    {
        return keyword;
    }
    public void setRetrievaltype(String retrievaltype) 
    {
        this.retrievaltype = retrievaltype;
    }

    public String getRetrievaltype() 
    {
        return retrievaltype;
    }
    public void setTaskid(Long taskid) 
    {
        this.taskid = taskid;
    }

    public Long getTaskid() 
    {
        return taskid;
    }
    public void setSearchconclusion(String searchconclusion) 
    {
        this.searchconclusion = searchconclusion;
    }

    public String getSearchconclusion() 
    {
        return searchconclusion;
    }
    public void setSourceurl(String sourceurl) 
    {
        this.sourceurl = sourceurl;
    }

    public String getSourceurl() 
    {
        return sourceurl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("entrynamez", getEntrynamez())
            .append("entrynamey", getEntrynamey())
            .append("company", getCompany())
            .append("postaladdress", getPostaladdress())
            .append("projectsource", getProjectsource())
            .append("noveltyretrievalxin", getNoveltyretrievalxin())
            .append("noveltyretrieval", getNoveltyretrieval())
            .append("noveltyrange", getNoveltyrange())
            .append("subjectarea", getSubjectarea())
            .append("technicalpoints", getTechnicalpoints())
            .append("spot", getSpot())
            .append("retrievalz", getRetrievalz())
            .append("retrievaly", getRetrievaly())
            .append("projectnumber", getProjectnumber())
            .append("nameofthereport", getNameofthereport())
            .append("projectsourcecontent", getProjectsourcecontent())
            .append("objectivecontent", getObjectivecontent())
            .append("enterprise", getEnterprise())
            .append("enterprise1", getEnterprise1())
            .append("type", getType())
            .append("releaseornot", getReleaseornot())
            .append("releasedate", getReleasedate())
            .append("year", getYear())
            .append("province", getProvince())
            .append("city", getCity())
            .append("area", getArea())
            .append("spotsplit", getSpotsplit())
            .append("projecttype", getProjecttype())
            .append("classificationnumber", getClassificationnumber())
            .append("keyword", getKeyword())
            .append("retrievaltype", getRetrievaltype())
            .append("taskid", getTaskid())
            .append("searchconclusion", getSearchconclusion())
            .append("sourceurl", getSourceurl())
            .toString();
    }
}
