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
public class Student extends Person{
    int studentId;
    String userName, password, registrationDate, expireDate;
    
    public void setStudentId(int id){
        this.studentId = id;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setRegistrationDate(String registrationDate){
        this.registrationDate = registrationDate;
    }
    public String getRegistrationDate(){
        return registrationDate;
    }
    public void setExpireDate(String expireDate){
        this.expireDate = expireDate;
    }
    public String getExpireDate(){
        return expireDate;
    }
}
