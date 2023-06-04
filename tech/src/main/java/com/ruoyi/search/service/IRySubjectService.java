package com.ruoyi.search.service;

import java.util.List;

import com.ruoyi.search.domain.*;

/**
 * 学科分析Service接口
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public interface IRySubjectService 
{

    /**
     * 学科企业性质关联【雷达图】
     * @param enterprise
     * @return
     */
    public List<RySubjectEnterprise> getSubjectEnterpriseNum(String enterprise,String year);

    /**
     * 查询某学科领域各个年份的项目数量【折线图】
     * @param subject
     * @return
     */
    public List<RySubjectYear> getSubjectYearNum(String subject);
    /**
     * 查询学科分析
     * 
     * @param id 学科分析主键
     * @return 学科分析
     */
    public RySubject selectRySubjectById(Integer id);

    /**
     * 查询学科分析列表
     * 
     * @param rySubject 学科分析
     * @return 学科分析集合
     */
    public List<RySubject> selectRySubjectList(RySubject rySubject);

    /**
     * 新增学科分析
     * 
     * @param rySubject 学科分析
     * @return 结果
     */
    public int insertRySubject(RySubject rySubject);

    /**
     * 修改学科分析
     * 
     * @param rySubject 学科分析
     * @return 结果
     */
    public int updateRySubject(RySubject rySubject);

    /**
     * 批量删除学科分析
     * 
     * @param ids 需要删除的学科分析主键集合
     * @return 结果
     */
    public int deleteRySubjectByIds(Integer[] ids);

    /**
     * 删除学科分析信息
     * 
     * @param id 学科分析主键
     * @return 结果
     */
    public int deleteRySubjectById(Integer id);
}
