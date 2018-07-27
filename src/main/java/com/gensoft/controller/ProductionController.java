package com.gensoft.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductionController {

	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Ganeshh");
		return "welcome";
	}
	@RequestMapping("/gg")
	public String gg(Map<String, Object> model) {
		model.put("message", "Gangthggggheshh");
		return "welcome";
	}
}
