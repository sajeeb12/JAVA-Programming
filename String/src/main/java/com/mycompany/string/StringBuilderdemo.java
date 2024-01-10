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
public class StringBuilderdemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder s = new StringBuilder("Sajeeb ");
        s.append("Molla");
        System.out.println("Name: "+s);
        s.reverse();
        System.out.println("Reverse: "+s);
        s.reverse();
        s.delete(0,7);
        System.out.println("After Deleting: "+s);
    }
}
