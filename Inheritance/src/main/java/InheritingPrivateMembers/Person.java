/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritingPrivateMembers;

/**
 *
 * @author sajeeb
 */
public class Person {
    private String name;
    private int age;
    
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
    
    void displayInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Name: "+this.age);
    }
}
