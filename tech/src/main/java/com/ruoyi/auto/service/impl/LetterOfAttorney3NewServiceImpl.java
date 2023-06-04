package com.ruoyi.auto.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.auto.mapper.LetterOfAttorney3NewMapper;
import com.ruoyi.auto.domain.LetterOfAttorney3New;
import com.ruoyi.auto.service.ILetterOfAttorney3NewService;

/**
 * 分类检索Service业务层处理
 * 
 * @author reliableyang
 * @date 2023-04-16
 */
@Service
public class LetterOfAttorney3NewServiceImpl implements ILetterOfAttorney3NewService 
{
    @Autowired
    private LetterOfAttorney3NewMapper letterOfAttorney3NewMapper;

    /**
     * 查询分类检索
     * 
     * @param id 分类检索主键
     * @return 分类检索
     */
    @Override
    public LetterOfAttorney3New selectLetterOfAttorney3NewById(Integer id)
    {
        return letterOfAttorney3NewMapper.selectLetterOfAttorney3NewById(id);
    }

    /**
     * 查询分类检索列表
     * 
     * @param letterOfAttorney3New 分类检索
     * @return 分类检索
     */
    @Override
    public List<LetterOfAttorney3New> selectLetterOfAttorney3NewList(LetterOfAttorney3New letterOfAttorney3New)
    {
        return letterOfAttorney3NewMapper.selectLetterOfAttorney3NewList(letterOfAttorney3New);
    }

    /**
     * 新增分类检索
     * 
     * @param letterOfAttorney3New 分类检索
     * @return 结果
     */
    @Override
    public int insertLetterOfAttorney3New(LetterOfAttorney3New letterOfAttorney3New)
    {
        return letterOfAttorney3NewMapper.insertLetterOfAttorney3New(letterOfAttorney3New);
    }

    /**
     * 修改分类检索
     * 
     * @param letterOfAttorney3New 分类检索
     * @return 结果
     */
    @Override
    public int updateLetterOfAttorney3New(LetterOfAttorney3New letterOfAttorney3New)
    {
        return letterOfAttorney3NewMapper.updateLetterOfAttorney3New(letterOfAttorney3New);
    }

    /**
     * 批量删除分类检索
     * 
     * @param ids 需要删除的分类检索主键
     * @return 结果
     */
    @Override
    public int deleteLetterOfAttorney3NewByIds(Integer[] ids)
    {
        return letterOfAttorney3NewMapper.deleteLetterOfAttorney3NewByIds(ids);
    }

    /**
     * 删除分类检索信息
     * 
     * @param id 分类检索主键
     * @return 结果
     */
    @Override
    public int deleteLetterOfAttorney3NewById(Integer id)
    {
        return letterOfAttorney3NewMapper.deleteLetterOfAttorney3NewById(id);
    }
}
