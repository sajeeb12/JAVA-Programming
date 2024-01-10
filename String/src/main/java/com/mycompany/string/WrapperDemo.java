/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.string;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x= 30;
//        Primitive to Object
        Integer y = Integer.valueOf(x);
        System.out.println("y: "+y);
        Integer z = x;//autoboxing
        System.out.println("z: "+z);
        
//        Object tp Primitive
        Double d = new Double(10.25);
        System.out.println("d: "+d);
        double e = d; //unboxing
        System.out.println("e: "+e);
        
    }
}
