/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;
import java.util.*;

/**
 *
 * @author sajeeb
 */
public class ValidVoter {
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age:");
        age = scn.nextInt();
        if( age >= 18){
            System.out.println("You are a Voter");
        }
        else{
            System.out.println("You are a Child");
        }
    }
}
