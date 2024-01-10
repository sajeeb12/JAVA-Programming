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
public class IntToString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = Integer.toString(n);
        if(s instanceof String ==true){
            System.out.println("Good Job");
        }
        else{
            System.out.println("Wrong Answer");
        }
    }
}
