package com.ruoyi.search.mapper;

import java.util.List;

import com.ruoyi.search.domain.RyCompanySubject;
import com.ruoyi.search.domain.RyRegion;
import com.ruoyi.search.domain.RyRegionSubject;
import org.apache.ibatis.annotations.Param;

/**
 * 地域分析Mapper接口
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public interface RyRegionMapper 
{
    /**
     * 查询某地域各个学科领域的项目数【柱状图】
     * @param province
     * @return
     */
    public List<RyRegionSubject> getRegionSubjectNum(@Param("province") String province,
                                                     @Param("year") String year);
    /**
     * 查询地域分析
     * 
     * @param id 地域分析主键
     * @return 地域分析
     */
    public RyRegion selectRyRegionById(Integer id);

    /**
     * 查询地域分析列表
     * 
     * @param ryRegion 地域分析
     * @return 地域分析集合
     */
    public List<RyRegion> selectRyRegionList(RyRegion ryRegion);

    /**
     * 新增地域分析
     * 
     * @param ryRegion 地域分析
     * @return 结果
     */
    public int insertRyRegion(RyRegion ryRegion);

    /**
     * 修改地域分析
     * 
     * @param ryRegion 地域分析
     * @return 结果
     */
    public int updateRyRegion(RyRegion ryRegion);

    /**
     * 删除地域分析
     * 
     * @param id 地域分析主键
     * @return 结果
     */
    public int deleteRyRegionById(Integer id);

    /**
     * 批量删除地域分析
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRyRegionByIds(Integer[] ids);
}
