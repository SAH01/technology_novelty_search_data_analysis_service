package com.ruoyi.search.service.impl;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.search.domain.*;
import com.ruoyi.search.mapper.RyIndexMapper;
import com.ruoyi.search.service.IRyIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2023-04-16 11:01
 */
@Service
public class RyIndexServiceImpl implements IRyIndexService {
	@Autowired
	private RyIndexMapper ryIndexMapper;
	@Override
	public List<RySubjectTop> selectRySubjectTopList(Integer top) {
		return ryIndexMapper.getSubjectTop(top);
	}
	@Override
	public List<RySubjectTop> selectRySubjectLastList(Integer last) {
		return ryIndexMapper.getSubjectLast(last);
	}
	@Override
	public List<RyResourceTop> getProjectSource() {
		return ryIndexMapper.getProjectSource();
	}

	@Override
	public List<RyAimTop> getProjectAim() {
		return ryIndexMapper.getProjectAim();
	}

	@Override
	public List<RyCompanyTop> getCompanyTop(Integer top){
		return ryIndexMapper.getCompanyTop(top);
	}

	@Override
	public List<RyRegionSum> getRegionTop(Integer top){
		return ryIndexMapper.getRegionTop(top);
	}
}