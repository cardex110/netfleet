package com.cardex.netfleet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardex.netfleet.models.Country;
import com.cardex.netfleet.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;

	//Return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//save country
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	//get by id
	public Optional<Country> findById(Integer id) {
		return countryRepository.findById(id);
	}

	//delete
	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
	
	
}
