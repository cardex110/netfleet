package com.cardex.netfleet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cardex.netfleet.models.Country;
import com.cardex.netfleet.services.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/country")
	public String getCountries(Model model) {
		
		List<Country> countryList = countryService.getCountries();
		
		model.addAttribute("countries", countryList);
		
		return "country";
	}
	
	@PostMapping("/country/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/country";
	}
}
