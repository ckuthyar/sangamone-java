package com.sangamone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Test1Controller {
	@RequestMapping("/test1")
	public String display1() {
		return "index.jsp";
	}

}
