/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritingPrivateMembers;

/**
 *
 * @author sajeeb
 */
public class Teacher extends Person{
    private String qual;
    
    public String getQual(){
        return this.qual;
    }
    public void setQual(String qual){
        this.qual = qual;
    }
    
    @Override
    void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Name: "+getAge());
        System.out.println("Name: "+getQual());
        
    }
}
