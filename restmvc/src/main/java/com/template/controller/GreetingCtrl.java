package com.template.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.template.bean.BeanResponse;

@RestController
@RequestMapping("/greeting")
public class GreetingCtrl {

	@RequestMapping(value = "/{name}", method=RequestMethod.GET)
	public String sayHi(@PathVariable String name){
		return "Hi " + name;
	}
	
	@RequestMapping(value = "/subjects/{name}", method=RequestMethod.GET)
	public BeanResponse getSubjects(@PathVariable String name){
		BeanResponse response  = new BeanResponse();
		response.setStudentName("name");
		response.setSubjectsAtSchool(5);
		return response;
	}
}
