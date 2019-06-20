package com.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.springboot.domain.City;
import com.spring.springboot.dubbo.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by zzg on 01/04/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {
 
	public City findCityByName(String cityName) {
		// TODO Auto-generated method stub
		return new City(1L,2L,"美丽的增城","是我的家乡");
	}
 
}