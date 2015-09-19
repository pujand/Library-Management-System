/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DBConnection {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    public DBConnection(){
        try{
       Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
    public ArrayList<Person> getPersons(){
        ArrayList<Person> persons = new ArrayList<>();
        try {
            pstmt = con.prepareStatement("SELECT * FROM person");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Person person = new Person();
                person.setId(rs.getInt("id"));
                person.setFirstName(rs.getString("firstname"));
                person.setMiddleName(rs.getString("middlename"));
                person.setLastName(rs.getString("lastname"));
                person.setAddress(rs.getString("address"));
                person.setPhoneNo(rs.getString("phonenumber"));
                person.setDateOfBirth(rs.getString("dob"));
                persons.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return persons;
    }
    public ArrayList<Person> searchPerson(String name){
        ArrayList<Person> persons = new ArrayList<>();
        try {
            pstmt = con.prepareStatement("SELECT * FROM person WHERE first_name LIKE '%"+name+"%' OR last_name LIKE '%"+name+"%'");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Person person = new Person();
                person.setId(rs.getInt("id"));
                person.setFirstName(rs.getString("firstname"));
                person.setMiddleName(rs.getString("middlename"));
                person.setLastName(rs.getString("lastname"));
                person.setAddress(rs.getString("address"));
                person.setPhoneNo(rs.getString("phone_number"));
                person.setDateOfBirth(rs.getString("dob"));
                persons.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return persons;
    }
     public int savePerson(Person person){
         int result = -1;
        try {
            pstmt = con.prepareStatement("INSERT INTO person(first_name,last_name,address,phone_number,dob) VALUES ('"
                    +person.getFirstName()+"','"+person.getMiddleName()+"','"+person.getLastName()+"','"
                    +person.getAddress()+"','"+person.getPhoneNo()+"','"+person.getDateOfBirth()+"')");
            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
     public int updatePerson(Person person){
         int result = -1;
        try {
            pstmt = con.prepareStatement("UPDATE person SET firstname='"+person.getFirstName()+"', middlename='"+person.getMiddleName()+"', last_name='"
                    +person.getLastName()+"', address='"+person.getAddress()+"', phone_number='"
                    +person.getPhoneNo()+"', dob='"+person.getDateOfBirth()+"' WHERE id="+person.getId()+"");
            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
     public int deletePerson(long id){
         int result = -1;
        try {
            pstmt = con.prepareStatement("DELETE FROM person WHERE id="+id+"");
            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
     }
    
     public Person getPerson(long id){
        return null;
    }   
}
