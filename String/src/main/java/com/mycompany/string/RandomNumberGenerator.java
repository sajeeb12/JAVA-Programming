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
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(10)+1;
        System.out.println("Random Number: "+randomNumber);
        
        int r = (int) (Math.random()*10);
        System.out.println(r);
    }
}
