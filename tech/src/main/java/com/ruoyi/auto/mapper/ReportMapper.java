package com.ruoyi.auto.mapper;

import com.ruoyi.auto.domain.LetterOfAttorney3New;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("MybatisResultTypeCheck")
public interface ReportMapper {
    /**
     * 根据学科分类查询
     * @param subject 学科分类
     * @return
     */
    public List<LetterOfAttorney3New> selectReportBySubject(@Param("subject") String subject, @Param("keyword") String keyword);
}
