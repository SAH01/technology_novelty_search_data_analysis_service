package com.ruoyi.search.service;

import java.util.List;
import com.ruoyi.search.domain.RyProject;

/**
 * 项目分析Service接口
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
public interface IRyProjectService 
{
    /**
     * 查询项目分析
     * 
     * @param id 项目分析主键
     * @return 项目分析
     */
    public RyProject selectRyProjectById(Integer id);

    /**
     * 查询 By 单位
     * @param company
     * @return
     */
    public List<RyProject> selectRyProjectByCompany(String company);
    public List<RyProject> selectRyProjectByCompanyAndYear(String company,String year);
    /**
     * 查询 By 省份
     * @param province
     * @return
     */
    public List<RyProject> selectRyProjectByProvince(String province);
    List<RyProject> selectRyProjectByProvinceAndYear(String province, String year);
    /**
     * 查询 By 学科
     * @param subject
     * @return
     */
    public List<RyProject> selectRyProjectBySubject(String subject);
    public List<RyProject> selectRyProjectBySubjectAndYear(String subject,String year);
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
     * 批量删除项目分析
     * 
     * @param ids 需要删除的项目分析主键集合
     * @return 结果
     */
    public int deleteRyProjectByIds(Integer[] ids);

    /**
     * 删除项目分析信息
     * 
     * @param id 项目分析主键
     * @return 结果
     */
    public int deleteRyProjectById(Integer id);

}
