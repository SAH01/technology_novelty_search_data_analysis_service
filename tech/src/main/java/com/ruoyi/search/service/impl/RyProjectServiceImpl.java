package com.ruoyi.search.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.search.mapper.RyProjectMapper;
import com.ruoyi.search.domain.RyProject;
import com.ruoyi.search.service.IRyProjectService;

/**
 * 项目分析Service业务层处理
 * 
 * @author reliableyang
 * @date 2023-04-15
 */
@Service
public class RyProjectServiceImpl implements IRyProjectService 
{
    @Autowired
    private RyProjectMapper ryProjectMapper;

    /**
     * 查询项目分析
     * 
     * @param id 项目分析主键
     * @return 项目分析
     */
    @Override
    public RyProject selectRyProjectById(Integer id)
    {
        return ryProjectMapper.selectRyProjectById(id);
    }

    /**
     * 查询项目分析  By 单位
     * @param company
     * @return
     */
    @Override
    public List<RyProject> selectRyProjectByCompany(String company) {
        return (List<RyProject>) ryProjectMapper.selectRyProjectByCompany(company);
    }
    @Override
    public List<RyProject> selectRyProjectByCompanyAndYear(String company,String year) {
        return (List<RyProject>) ryProjectMapper.selectRyProjectByCompanyAndYear(company,year);
    }
    /**
     * 查询项目分析  By 省份
     * @param province
     * @return
     */
    @Override
    public List<RyProject> selectRyProjectByProvince(String province) {
        return (List<RyProject>) ryProjectMapper.selectRyProjectByProvince(province);
    }
    @Override
    public List<RyProject> selectRyProjectByProvinceAndYear(String province,String year) {
        return (List<RyProject>) ryProjectMapper.selectRyProjectByProvinceAndYear(province,year);
    }
    /**
     * 查询项目分析  By 学科
     * @param subject
     * @return
     */
    @Override
    public List<RyProject> selectRyProjectBySubject(String subject) {
        return (List<RyProject>) ryProjectMapper.selectRyProjectBySubject(subject);
    }
    @Override
    public List<RyProject> selectRyProjectBySubjectAndYear(String subject,String year) {
        return (List<RyProject>) ryProjectMapper.selectRyProjectBySubjectAndYear(subject,year);
    }

    /**
     * 查询项目分析列表
     * 
     * @param ryProject 项目分析
     * @return 项目分析
     */
    @Override
    public List<RyProject> selectRyProjectList(RyProject ryProject)
    {
        return ryProjectMapper.selectRyProjectList(ryProject);
    }

    /**
     * 新增项目分析
     * 
     * @param ryProject 项目分析
     * @return 结果
     */
    @Override
    public int insertRyProject(RyProject ryProject)
    {
        return ryProjectMapper.insertRyProject(ryProject);
    }

    /**
     * 修改项目分析
     * 
     * @param ryProject 项目分析
     * @return 结果
     */
    @Override
    public int updateRyProject(RyProject ryProject)
    {
        return ryProjectMapper.updateRyProject(ryProject);
    }

    /**
     * 批量删除项目分析
     * 
     * @param ids 需要删除的项目分析主键
     * @return 结果
     */
    @Override
    public int deleteRyProjectByIds(Integer[] ids)
    {
        return ryProjectMapper.deleteRyProjectByIds(ids);
    }

    /**
     * 删除项目分析信息
     * 
     * @param id 项目分析主键
     * @return 结果
     */
    @Override
    public int deleteRyProjectById(Integer id)
    {
        return ryProjectMapper.deleteRyProjectById(id);
    }
}
