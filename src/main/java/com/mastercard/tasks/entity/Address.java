package com.mastercard.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name = "address_table")
public class Address {
    @Id
    @GeneratedValue
    private int info_id;
//    private String first_Name;
//    private String last_Name;
    private String add1;
    private String add2;
    private String city;
    private String state;
    private int zipCode;
    private String country;


    public int getInfo_id() {
        return info_id;
    }
    public void setInfo_id(int info_id) {
        this.info_id = info_id;
    }
//    public String getFirst_Name() {
//        return first_Name;
//    }
//
//    public void setFirst_Name(String first_Name) {
//        this.first_Name = first_Name;
//    }
//
//    public String getLast_Name() {
//        return last_Name;
//    }
//
//    public void setLast_Name(String last_Name) {
//        this.last_Name = last_Name;
//    }

    public String getAdd1() {
        return add1;
    }
    public void setAdd1(String add1) {
        this.add1 = add1;
    }
    public String getAdd2() {
        return add2;
    }
    public void setAdd2(String add2) {
        this.add2 = add2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }



    @Override
    public String toString() {
        return "Address{" +
                "info_id=" + info_id
//                +
//                ", first_Name='" + first_Name + '\'' +
//                ", last_Name='" + last_Name + '\''
                +
                ", add1='" + add1 + '\'' +
                ", add2='" + add2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                '}';
    }
}
