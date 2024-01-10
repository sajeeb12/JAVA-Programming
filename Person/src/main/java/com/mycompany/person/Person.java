/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.person;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Person {
    private String name;
    private int age;
    private int mobile;
    
    Person(){
//        System.out.println("No Value");
    }
    Person(String name,int age,int mobile){
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    
    public void setMobile(int mobile){
        this.mobile = mobile;
    }
    public int getMobile(){
        return this.mobile;
    }
    
    public void displayInformation(){
        System.out.println("Person's name is: "+this.name);
        System.out.println("Person's Age is: "+this.age);
        System.out.println("Person's Mobile is: "+this.mobile);
    }
    
}
