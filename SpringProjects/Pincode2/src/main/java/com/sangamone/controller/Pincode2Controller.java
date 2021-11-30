package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangamone.repository.Pincode2Repo;

@Controller
public class Pincode2Controller {
	@Autowired
	Pincode2Repo pincode2Repo;
	
	@RequestMapping("/pincode")
	public String getPincodeAll(Model model) {
		model.addAttribute("pincode", pincode2Repo.findAll());
		return "displayAll.jsp";
	}
	
	@RequestMapping("/getPincode")
	public String gePincode(Model model, @RequestParam int pincode) {
		model.addAttribute("pincode", pincode2Repo.getPincode(pincode));
		return "display.jsp";
	}
	

}
