/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuffer s1 = new StringBuffer(s);
        String s2 = s1.reverse().toString();
        if(s.equals(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
