package com.sangamone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test7Controller {
	@RequestMapping("/test7")
	public String display7() {
		return "index.jsp";
	}

}
