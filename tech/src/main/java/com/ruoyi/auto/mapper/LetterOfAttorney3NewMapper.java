package com.ruoyi.auto.mapper;

import java.util.List;
import com.ruoyi.auto.domain.LetterOfAttorney3New;

/**
 * 分类检索Mapper接口
 * 
 * @author reliableyang
 * @date 2023-04-16
 */
@SuppressWarnings("MybatisResultTypeCheck")
public interface LetterOfAttorney3NewMapper
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
     * 删除分类检索
     * 
     * @param id 分类检索主键
     * @return 结果
     */
    public int deleteLetterOfAttorney3NewById(Integer id);

    /**
     * 批量删除分类检索
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLetterOfAttorney3NewByIds(Integer[] ids);
}
