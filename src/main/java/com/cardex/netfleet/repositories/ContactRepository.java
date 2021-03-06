package com.cardex.netfleet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardex.netfleet.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
