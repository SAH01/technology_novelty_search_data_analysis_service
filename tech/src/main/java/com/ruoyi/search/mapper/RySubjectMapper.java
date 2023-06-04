package com.ruoyi.search.mapper;

import java.util.List;

import com.ruoyi.search.domain.*;
import org.apache.ibatis.annotations.Param;

/**
 * 学科分析Mapper接口
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public interface RySubjectMapper 
{
    /**
     * 学科 企业性质 【雷达图】
     * @param enterprise
     * @return
     */
    public List<RySubjectEnterprise> getSubjectEnterpriseNum(@Param("subject") String enterprise,
                                                             @Param("year") String year);
    /**
     * 查询某学科领域各个年份的项目数【折线图】
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
     * 删除学科分析
     * 
     * @param id 学科分析主键
     * @return 结果
     */
    public int deleteRySubjectById(Integer id);

    /**
     * 批量删除学科分析
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRySubjectByIds(Integer[] ids);
}
