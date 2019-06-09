package com.example.github.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@ResponseBody
	public String index() {
		System.out.println("This is index controllers");
		return "";
	}
}