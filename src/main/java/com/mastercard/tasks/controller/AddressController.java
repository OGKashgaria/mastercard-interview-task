package com.mastercard.tasks.controller;


import com.mastercard.tasks.entity.Address;
import com.mastercard.tasks.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping("/addAddress")
    public Address addAddress(@RequestBody Address address){
        return  service.saveAddress(address);
    }

    @PostMapping("/addAddresses")
    public List<Address> addAddress(@RequestBody List<Address> addresses){
        return  service.saveAddresses(addresses);
    }

    @GetMapping("/addresses")
    public List<Address> getAllAddresses(){
        return service.getAddresses();
    }

    @GetMapping("/addressById/{info_id}")
    public Address findAddressById(@PathVariable int info_id){

        return service.getAddressById(info_id);
    }

    @GetMapping("/addressByCity/{city}")
    public Address findAddressCity(@PathVariable String city){
        return service.getAddressByCity(city);
    }



    @PutMapping("/updateAddress")
    public Address updateAddress(@RequestBody Address address){
        return  service.updateAddress(address);
    }

    @PutMapping("/updateAddresses")
    public List<Address> updateAddresses(@RequestBody List<Address> addresses){
        return  service.updateAddresses(addresses);
    }


    @DeleteMapping("/deleteAddress/{info_id}")
    public String deleteAddress(@PathVariable int info_id){

        return service.deleteAddress(info_id);
    }

}
