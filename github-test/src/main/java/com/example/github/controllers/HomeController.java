package com.example.github.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	public void home() {
		System.out.println("this is change");
	}
	
	@ResponseBody
	public void index() {
		
	}
}
