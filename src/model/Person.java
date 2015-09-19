/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Person {
    String firstName, middleName, lastName, address, phoneNumber, dateOfBirth;
    int id;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setPhoneNo(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNo(){
        return phoneNumber;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
}
