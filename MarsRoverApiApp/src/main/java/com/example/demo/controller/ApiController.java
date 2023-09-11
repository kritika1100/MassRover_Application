package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.response.MarsRoverApiResponse;

import com.example.demo.serviceimpl.MarsRoverApiServiceImpl;
import com.example.entity.HomeDto;

@Controller
public class ApiController {

	
@Autowired
 private MarsRoverApiServiceImpl service;

@SuppressWarnings("deprecation")
@GetMapping("/")
public String callApi(ModelMap model,HomeDto homeDto) {
	if(StringUtils.isEmpty(homeDto.getMarsApiRoverData())) {
		homeDto.setMarsApiRoverData("Opportunity");	
		
	}
	if(homeDto.getMarsSol() == 0) {
		homeDto.setMarsSol(1);
	}
	MarsRoverApiResponse response= service.getRoverData(homeDto.getMarsApiRoverData(),homeDto.getMarsSol());
	model.put("response",response);
	model.put("homeDto", homeDto);
	
	return "index";}
	
	
//@PostMapping("/")	 
//public String CallMarsApi(ModelMap model,@RequestParam String marsRoverApiData)
//{
//	MarsRoverApiResponse response= service.getRoverData(marsRoverApiData);
//	model.put("response",response);
//	return "index";
//	
//}
}

