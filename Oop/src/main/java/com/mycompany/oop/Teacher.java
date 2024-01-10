/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Teacher {
    String name;
    String gender;
    int phone;
    
    Teacher(String name,String gender,int phone){
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
    
    void displayInformation(){
        System.out.println("Teachers name: "+name);
        System.out.println("Teachers gender: "+gender);
        System.out.println("Teachers phone: "+phone);
    }
}
