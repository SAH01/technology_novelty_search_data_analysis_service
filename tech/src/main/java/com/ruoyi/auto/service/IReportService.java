package com.ruoyi.auto.service;

import com.ruoyi.auto.domain.LetterOfAttorney3New;
import com.ruoyi.auto.domain.RyRegionMap;

import java.util.List;

public interface IReportService {
    public List<LetterOfAttorney3New> getReportBySubject(String subject,String keyword);
}
