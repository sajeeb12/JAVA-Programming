/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class ForLoop {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter How many Times: ");
        int n = scn.nextInt();
        
        for(int i=2; i<=n; i=i+2){
            System.out.println(i+" Bangladesh");
        }
    }
}
