package com.cardex.netfleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardex.netfleet.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
