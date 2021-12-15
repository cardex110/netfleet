package com.cardex.netfleet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cardex.netfleet.models.State;
import com.cardex.netfleet.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;

	@GetMapping("/state")
	public String getCountries(Model model) {

		List<State> stateList = stateService.getStates();

		model.addAttribute("states", stateList);

		return "state";
	}

	@PostMapping("/state/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/state";
	}

	@RequestMapping("/state/findById")
	@ResponseBody
	public Optional<State> findById(Integer id) {
		return stateService.findById(id);
	}

	@RequestMapping(value = "/state/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(Integer id) {
		stateService.delete(id);
		return "redirect:/state";
	}
}
