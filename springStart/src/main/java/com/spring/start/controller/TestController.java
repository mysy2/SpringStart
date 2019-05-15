package com.spring.start.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.start.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService service;
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/selectNow.do")
	public void selectNow() {
		String result = service.selectNow();
		System.out.println(result);
	}
}
