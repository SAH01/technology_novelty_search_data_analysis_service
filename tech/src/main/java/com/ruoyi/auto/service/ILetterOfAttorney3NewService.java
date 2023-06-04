package com.ruoyi.auto.service;

import java.util.List;
import com.ruoyi.auto.domain.LetterOfAttorney3New;

/**
 * 分类检索Service接口
 * 
 * @author reliableyang
 * @date 2023-04-16
 */
public interface ILetterOfAttorney3NewService 
{
    /**
     * 查询分类检索
     * 
     * @param id 分类检索主键
     * @return 分类检索
     */
    public LetterOfAttorney3New selectLetterOfAttorney3NewById(Integer id);

    /**
     * 查询分类检索列表
     * 
     * @param letterOfAttorney3New 分类检索
     * @return 分类检索集合
     */
    public List<LetterOfAttorney3New> selectLetterOfAttorney3NewList(LetterOfAttorney3New letterOfAttorney3New);

    /**
     * 新增分类检索
     * 
     * @param letterOfAttorney3New 分类检索
     * @return 结果
     */
    public int insertLetterOfAttorney3New(LetterOfAttorney3New letterOfAttorney3New);

    /**
     * 修改分类检索
     * 
     * @param letterOfAttorney3New 分类检索
     * @return 结果
     */
    public int updateLetterOfAttorney3New(LetterOfAttorney3New letterOfAttorney3New);

    /**
     * 批量删除分类检索
     * 
     * @param ids 需要删除的分类检索主键集合
     * @return 结果
     */
    public int deleteLetterOfAttorney3NewByIds(Integer[] ids);

    /**
     * 删除分类检索信息
     * 
     * @param id 分类检索主键
     * @return 结果
     */
    public int deleteLetterOfAttorney3NewById(Integer id);
}
