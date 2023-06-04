package com.ruoyi.search.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.search.domain.RyCompanySubject;
import com.ruoyi.search.domain.RyCompanyYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.search.mapper.RyCompanyMapper;
import com.ruoyi.search.domain.RyCompany;
import com.ruoyi.search.service.IRyCompanyService;

/**
 * 单位分析Service业务层处理
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@Service
public class RyCompanyServiceImpl implements IRyCompanyService 
{
    @Autowired
    private RyCompanyMapper ryCompanyMapper;

    /**
     * 查询某单位各个学科领域的项目数【雷达图】
     * @param company
     * @return
    */
    @Override
    public List<RyCompanySubject> getCompanySubjectNum(String company , String year) {
        return ryCompanyMapper.getCompanySubjectNum(company,year);
    }
    /**
     * 查询某单位各个年份的项目数【折线图】
     * @param company
     * @return
     */
    @Override
    public List<RyCompanyYear> getCompanyYearNum(String company) {

        return ryCompanyMapper.getCompanyYearNum(company);
    }

    /**
     * 查询单位分析
     * 
     * @param id 单位分析主键
     * @return 单位分析
     */
    @Override
    public RyCompany selectRyCompanyById(Integer id)
    {
        return ryCompanyMapper.selectRyCompanyById(id);
    }

    /**
     * 查询单位分析列表
     * 
     * @param ryCompany 单位分析
     * @return 单位分析
     */
    @Override
    public List<RyCompany> selectRyCompanyList(RyCompany ryCompany)
    {
        return ryCompanyMapper.selectRyCompanyList(ryCompany);
    }

    /**
     * 新增单位分析
     * 
     * @param ryCompany 单位分析
     * @return 结果
     */
    @Override
    public int insertRyCompany(RyCompany ryCompany)
    {
        return ryCompanyMapper.insertRyCompany(ryCompany);
    }

    /**
     * 修改单位分析
     * 
     * @param ryCompany 单位分析
     * @return 结果
     */
    @Override
    public int updateRyCompany(RyCompany ryCompany)
    {
        return ryCompanyMapper.updateRyCompany(ryCompany);
    }

    /**
     * 批量删除单位分析
     * 
     * @param ids 需要删除的单位分析主键
     * @return 结果
     */
    @Override
    public int deleteRyCompanyByIds(Integer[] ids)
    {
        return ryCompanyMapper.deleteRyCompanyByIds(ids);
    }

    /**
     * 删除单位分析信息
     * 
     * @param id 单位分析主键
     * @return 结果
     */
    @Override
    public int deleteRyCompanyById(Integer id)
    {
        return ryCompanyMapper.deleteRyCompanyById(id);
    }
}
