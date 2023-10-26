/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */

import People.Person;
import info5100.university.example.workareas.Workarea;

/**
 *
 * @author kal bugrara
 */
public class User {
    Person person;
    String UserID;
    String Password;
    
    public User(Person p){
        person = p;
    }
    
}