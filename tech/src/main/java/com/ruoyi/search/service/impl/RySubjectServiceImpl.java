package com.ruoyi.search.service.impl;

import java.util.List;

import com.ruoyi.search.domain.RyCompanyYear;
import com.ruoyi.search.domain.RySubjectEnterprise;
import com.ruoyi.search.domain.RySubjectYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.search.mapper.RySubjectMapper;
import com.ruoyi.search.domain.RySubject;
import com.ruoyi.search.service.IRySubjectService;

/**
 * 学科分析Service业务层处理
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@Service
public class RySubjectServiceImpl implements IRySubjectService 
{
    @Autowired
    private RySubjectMapper rySubjectMapper;

    /**
     * 学科 企业性质 【雷达图】
     * @param enterprise
     * @return
     */
    @Override
    public List<RySubjectEnterprise> getSubjectEnterpriseNum(String enterprise,String year) {
        return rySubjectMapper.getSubjectEnterpriseNum(enterprise,year);
    }

    /**
     * 查询某学科领域各个年份的项目数【折线图】
     * @param subject
     * @return
     */
    @Override
    public List<RySubjectYear> getSubjectYearNum(String subject) {

        return rySubjectMapper.getSubjectYearNum(subject);
    }
    /**
     * 查询学科分析
     * 
     * @param id 学科分析主键
     * @return 学科分析
     */
    @Override
    public RySubject selectRySubjectById(Integer id)
    {
        return rySubjectMapper.selectRySubjectById(id);
    }

    /**
     * 查询学科分析列表
     * 
     * @param rySubject 学科分析
     * @return 学科分析
     */
    @Override
    public List<RySubject> selectRySubjectList(RySubject rySubject)
    {
        return rySubjectMapper.selectRySubjectList(rySubject);
    }

    /**
     * 新增学科分析
     * 
     * @param rySubject 学科分析
     * @return 结果
     */
    @Override
    public int insertRySubject(RySubject rySubject)
    {
        return rySubjectMapper.insertRySubject(rySubject);
    }

    /**
     * 修改学科分析
     * 
     * @param rySubject 学科分析
     * @return 结果
     */
    @Override
    public int updateRySubject(RySubject rySubject)
    {
        return rySubjectMapper.updateRySubject(rySubject);
    }

    /**
     * 批量删除学科分析
     * 
     * @param ids 需要删除的学科分析主键
     * @return 结果
     */
    @Override
    public int deleteRySubjectByIds(Integer[] ids)
    {
        return rySubjectMapper.deleteRySubjectByIds(ids);
    }

    /**
     * 删除学科分析信息
     * 
     * @param id 学科分析主键
     * @return 结果
     */
    @Override
    public int deleteRySubjectById(Integer id)
    {
        return rySubjectMapper.deleteRySubjectById(id);
    }
}
