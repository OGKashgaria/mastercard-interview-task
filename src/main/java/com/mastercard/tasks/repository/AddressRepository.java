package com.mastercard.tasks.repository;

import com.mastercard.tasks.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    Address findByState(String state);
    Address findByCity(String city);
    Address findAllByCity(String city);
    Address findByCountry(String country);
    Address findByZipCode(String zipCode);



}
/*
 private String city;
    private String state;
    private int zipCode;
    private String country;
 */