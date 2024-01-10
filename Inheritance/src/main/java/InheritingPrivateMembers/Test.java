/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritingPrivateMembers;

/**
 *
 * @author sajeeb
 */
public class Test {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Tamanna");
        p1.setAge(13);
        p1.displayInfo();
        System.out.println();
        Teacher t1 = new Teacher();
//        t1.setName("Sajeeb");
        t1.setAge(27);
        t1.setQual("B.Sc.");
        
        t1.displayInfo();
        
       
    }
    
}
