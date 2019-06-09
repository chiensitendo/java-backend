package com.example.github.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	public String name() {
		System.out.println("This is new change");
		return "";
	}
}
