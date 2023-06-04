package com.ruoyi.search.service;

import java.util.List;
import com.ruoyi.search.domain.RyCompany;
import com.ruoyi.search.domain.RyCompanySubject;
import com.ruoyi.search.domain.RyCompanyYear;

/**
 * 单位分析Service接口
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public interface IRyCompanyService 
{

    /**
     * 查询某单位各个学科领域项目数量【雷达图】
     * @param company
     * @return
     */
    public List<RyCompanySubject> getCompanySubjectNum(String company,String year);

    /**
     * 查询某单位各个年份的项目数量【折线图】
     * @param company
     * @return
     */
    public List<RyCompanyYear> getCompanyYearNum(String company);
    /**
     * 查询单位分析
     * 
     * @param id 单位分析主键
     * @return 单位分析
     */
    public RyCompany selectRyCompanyById(Integer id);

    /**
     * 查询单位分析列表
     * 
     * @param ryCompany 单位分析
     * @return 单位分析集合
     */
    public List<RyCompany> selectRyCompanyList(RyCompany ryCompany);

    /**
     * 新增单位分析
     * 
     * @param ryCompany 单位分析
     * @return 结果
     */
    public int insertRyCompany(RyCompany ryCompany);

    /**
     * 修改单位分析
     * 
     * @param ryCompany 单位分析
     * @return 结果
     */
    public int updateRyCompany(RyCompany ryCompany);

    /**
     * 批量删除单位分析
     * 
     * @param ids 需要删除的单位分析主键集合
     * @return 结果
     */
    public int deleteRyCompanyByIds(Integer[] ids);

    /**
     * 删除单位分析信息
     * 
     * @param id 单位分析主键
     * @return 结果
     */
    public int deleteRyCompanyById(Integer id);
}
