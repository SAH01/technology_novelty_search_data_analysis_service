package com.ruoyi.auto.controller;

import com.ruoyi.auto.domain.LetterOfAttorney3New;
import com.ruoyi.auto.domain.RyRegionMap;
import com.ruoyi.auto.service.impl.ReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: ruoyi
 * @BelongsPackage: com.ruoyi.auto.controller
 * @Author: chuanwei.yang 42624
 * @CreateTime: 2023-05-03  18:40
 * @Description: TODO
 * @Version: 1.0
 */
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/auto/report")
public class ReportController {
    @Autowired
    private ReportServiceImpl reportService;
    @GetMapping("/project/{subject}/{keywords}")
    public List<Map<String, Object>> listProjectBySubject(@PathVariable("subject") String subject,@PathVariable("keywords") String keywords) {
        String newStr = subject.substring(0, subject.length() - 1);
        String[] words = keywords.split("、"); // 根据空格分词
        List<LetterOfAttorney3New> list = reportService.getReportBySubject(newStr,words[0]);
        System.out.println("查新参考文献：");
        List<Map<String, Object>> resList = new ArrayList<>();
        for (LetterOfAttorney3New letterOfAttorney3New : list) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("entrynamez", letterOfAttorney3New.getEntrynamez());
            map.put("sourceurl", letterOfAttorney3New.getSourceurl());
            resList.add(map);
        }
        System.out.println(resList);
        return resList;
    }
}
