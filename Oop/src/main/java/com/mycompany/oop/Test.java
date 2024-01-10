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
public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Sajeeb","Male",1533094326);
        Teacher teacher2 = new Teacher("Tamanna","Female",1994333613);
        
//        teacher1.setInformation("Sajeeb", "Male", 1533094326);
//        teacher2.setInformation("Tamanna", "Female", 1533094326);
        
        teacher1.displayInformation();
        System.out.println();
        teacher2.displayInformation();
    }
}
