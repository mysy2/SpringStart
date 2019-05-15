package com.spring.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements TestMapper {

	@Autowired
	private TestMapper mapper;
	
	@Override
	public String selectNow() {
		return mapper.selectNow();
	}
}
