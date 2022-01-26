package com.sangamone.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.test1.service.PincodeService;
import com.sangamone.test1.vo.PincodeVO;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	PincodeService pincodeService;
	@GetMapping("/display")
	public PincodeVO displayLocation(int pincode) {
		return pincodeService.displayLocation(pincode);
	}
}
