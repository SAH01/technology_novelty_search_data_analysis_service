package com.ruoyi.auto.service.impl;

import com.ruoyi.auto.domain.RyRegionMap;
import com.ruoyi.auto.mapper.RyRegionMapMapper;
import com.ruoyi.auto.service.IRyMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2023-04-16 22:38
 */
@Service
public class RyMapServiceImpl implements IRyMapService {
	@Autowired
	private RyRegionMapMapper ryRegionMapMapper;
	@Override
	public List<RyRegionMap> getRegionMap() {
		return ryRegionMapMapper.getRegionMap();
	}
}