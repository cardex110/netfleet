package com.cardex.netfleet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardex.netfleet.models.State;
import com.cardex.netfleet.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	//Return list of countries
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	//save state
	public void save(State state) {
		stateRepository.save(state);
	}
	
	//get by id
	public Optional<State> findById(Integer id) {
		return stateRepository.findById(id);
	}

	//delete
	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
	
}
