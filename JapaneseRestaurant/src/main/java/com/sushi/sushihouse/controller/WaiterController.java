package com.sushi.sushihouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sushi.sushihouse.service.SushiHouseService;

@Controller
@RequestMapping("/waiter")
public class WaiterController {

	@Autowired
	SushiHouseService sushiHouseService;
	
	@GetMapping("/")
	public String getMainContent(Model model) {
		model.addAttribute("dishs", sushiHouseService.findAllDish());
		return "waiter";
	}
}
