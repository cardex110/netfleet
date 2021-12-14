package com.cardex.netfleet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {

	@GetMapping("/state")
	public String getClient() {
		return "state";
	}
	
}
