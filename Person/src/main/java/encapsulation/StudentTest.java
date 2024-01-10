/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author sajeeb
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setCgpa(2.70);
        s1.setAge(24);
        s1.setName("Sajeeb Molla");
        
        s1.displayInfo();
    }
}
