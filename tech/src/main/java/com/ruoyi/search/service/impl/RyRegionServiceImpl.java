package com.ruoyi.search.service.impl;

import java.util.List;

import com.ruoyi.search.domain.RyCompanySubject;
import com.ruoyi.search.domain.RyRegionSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.search.mapper.RyRegionMapper;
import com.ruoyi.search.domain.RyRegion;
import com.ruoyi.search.service.IRyRegionService;

/**
 * 地域分析Service业务层处理
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@Service
public class RyRegionServiceImpl implements IRyRegionService 
{

    @Autowired
    private RyRegionMapper ryRegionMapper;
    /**
     * 查询某地域各个学科领域的项目数
     * @param province
     * @return
     */
    @Override
    public List<RyRegionSubject> getRegionSubjectNum(String province,String year) {
        return ryRegionMapper.getRegionSubjectNum(province,year);
    }
    /**
     * 查询地域分析
     * 
     * @param id 地域分析主键
     * @return 地域分析
     */
    @Override
    public RyRegion selectRyRegionById(Integer id)
    {
        return ryRegionMapper.selectRyRegionById(id);
    }

    /**
     * 查询地域分析列表
     * 
     * @param ryRegion 地域分析
     * @return 地域分析
     */
    @Override
    public List<RyRegion> selectRyRegionList(RyRegion ryRegion)
    {
        return ryRegionMapper.selectRyRegionList(ryRegion);
    }

    /**
     * 新增地域分析
     * 
     * @param ryRegion 地域分析
     * @return 结果
     */
    @Override
    public int insertRyRegion(RyRegion ryRegion)
    {
        return ryRegionMapper.insertRyRegion(ryRegion);
    }

    /**
     * 修改地域分析
     * 
     * @param ryRegion 地域分析
     * @return 结果
     */
    @Override
    public int updateRyRegion(RyRegion ryRegion)
    {
        return ryRegionMapper.updateRyRegion(ryRegion);
    }

    /**
     * 批量删除地域分析
     * 
     * @param ids 需要删除的地域分析主键
     * @return 结果
     */
    @Override
    public int deleteRyRegionByIds(Integer[] ids)
    {
        return ryRegionMapper.deleteRyRegionByIds(ids);
    }

    /**
     * 删除地域分析信息
     * 
     * @param id 地域分析主键
     * @return 结果
     */
    @Override
    public int deleteRyRegionById(Integer id)
    {
        return ryRegionMapper.deleteRyRegionById(id);
    }
}
