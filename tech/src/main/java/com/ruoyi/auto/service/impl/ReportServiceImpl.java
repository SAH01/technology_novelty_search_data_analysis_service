package com.ruoyi.auto.service.impl;

import com.ruoyi.auto.domain.LetterOfAttorney3New;
import com.ruoyi.auto.mapper.ReportMapper;
import com.ruoyi.auto.mapper.RyRegionMapMapper;
import com.ruoyi.auto.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: ruoyi
 * @BelongsPackage: com.ruoyi.auto.service.impl
 * @Author: chuanwei.yang 42624
 * @CreateTime: 2023-05-03  18:46
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class ReportServiceImpl implements IReportService {
    @Autowired
    private ReportMapper reportMapper;
    @Override
    public List<LetterOfAttorney3New> getReportBySubject(String subject,String keyword) {
        return reportMapper.selectReportBySubject(subject,keyword);
    }
}
