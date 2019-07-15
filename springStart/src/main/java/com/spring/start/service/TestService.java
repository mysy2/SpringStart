package com.spring.start.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements TestMapper {
	private static final Logger log = LoggerFactory.getLogger(TestService.class);

	@Autowired
	private TestMapper mapper;
	
	@Override
	public List<?> getBagicDB(Map<String, Object> map) {
		List<?> list = mapper.getBagicDB(map);
		
		for (int i = 0; i < list.size(); i++) {
			log.info("position : " + list.get(i));
		}
		
		return list;
	}
}
