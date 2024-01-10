/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author sajeeb
 */
public class Teacher extends Person{
    String qualification;
    
    Teacher(String name,int age,String qual){
        this.name = name;
        this.age = age;
        this.qualification = qual;
    }
    void displayTeacherInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }
}
