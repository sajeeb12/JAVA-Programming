/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author sajeeb
 */
public class Student {
    private String name;
    private int age;
    private double cgpa;
    
    Student(){
        
    }
    Student(String name,int age,double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    
    void displayInfo(){
        System.out.println("Student's Name: "+this.name);
        System.out.println("Student's Age: "+this.age);
        System.out.println("Student's CGPA: "+this.cgpa);
    }
}
