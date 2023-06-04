package com.ruoyi.search.mapper;

import java.util.List;
import com.ruoyi.search.domain.RyProject;
import org.apache.ibatis.annotations.Param;

/**
 * 项目分析Mapper接口
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public interface RyProjectMapper 
{
    /**
     * 查询项目分析
     * 
     * @param id 项目分析主键
     * @return 项目分析
     */
    public RyProject selectRyProjectById(Integer id);

    /**
     * 查询 By 单位和年份
     * @param company
     * @return
     */
    public List<RyProject> selectRyProjectByCompany(String company);

    public List<RyProject> selectRyProjectByCompanyAndYear(@Param("company") String company,@Param("year") String year);

    /**
     * 查询 By 省份
     * @param province
     * @return
     */
    public List<RyProject> selectRyProjectByProvince(String province);

    public List<RyProject> selectRyProjectByProvinceAndYear(@Param("province") String province,@Param("year") String year);
    /**
     * 查询 By 单位
     * @param subject
     * @return
     */
    public List<RyProject> selectRyProjectBySubject(String subject);
    public List<RyProject> selectRyProjectBySubjectAndYear(@Param("subject") String subject,
                                                           @Param("year") String year);
    /**
     * 查询项目分析列表
     * 
     * @param ryProject 项目分析
     * @return 项目分析集合
     */
    public List<RyProject> selectRyProjectList(RyProject ryProject);

    /**
     * 新增项目分析
     * 
     * @param ryProject 项目分析
     * @return 结果
     */
    public int insertRyProject(RyProject ryProject);

    /**
     * 修改项目分析
     * 
     * @param ryProject 项目分析
     * @return 结果
     */
    public int updateRyProject(RyProject ryProject);

    /**
     * 删除项目分析
     * 
     * @param id 项目分析主键
     * @return 结果
     */
    public int deleteRyProjectById(Integer id);

    /**
     * 批量删除项目分析
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRyProjectByIds(Integer[] ids);
}
