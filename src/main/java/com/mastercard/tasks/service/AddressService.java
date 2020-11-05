package com.mastercard.tasks.service;

import com.mastercard.tasks.entity.Address;
import com.mastercard.tasks.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    //post methods

    public Address saveAddress(Address address){

       return repository.save(address);
    }

    public List<Address> saveAddresses(List<Address> addresses){

        return repository.saveAll(addresses);
    }

    // GET methods


    public List<Address> getAddresses(){

        return repository.findAll();
    }
    public Address getAddressById(int info_id){

        return repository.findById(info_id).orElse(new Address());
    }

    public Address getAddressByCity(String city){

        return repository.findByCity(city);
    }

// delete methods

    public String deleteAddress (int info_id){
        return "You are good! Successfully deleted address on info_if: " + info_id;
    }

    //put method
    public Address updateAddress(Address address){
        Address existingAddress = repository.findById(address.getInfo_id()).orElse(new Address());
        existingAddress.setAdd1(address.getAdd1());
        existingAddress.setAdd2(address.getAdd2());
        existingAddress.setCity(address.getCity());
        existingAddress.setState(address.getState());
        existingAddress.setZipCode(address.getZipCode());
        existingAddress.setCountry(address.getCountry());

        return repository.save(existingAddress);

    }

    //put method
    public List<Address> updateAddresses(List<Address> addresses){


        Address existingAddress=null;
        for (Address each : addresses) {
            existingAddress = repository.findById(each.getInfo_id()).orElse(new Address());
            existingAddress.setAdd1(each.getAdd1());
            existingAddress.setAdd2(each.getAdd2());
            existingAddress.setCity(each.getCity());
            existingAddress.setState(each.getState());
            existingAddress.setZipCode(each.getZipCode());
            existingAddress.setCountry(each.getCountry());

             repository.save(existingAddress);

        }

        return addresses;

    }

}
