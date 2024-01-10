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
public class CountNotes {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int note500,note100,note50,note20,note10,note5,note2,note1;
        note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        
        System.out.print("Enter the Amount:");
        int amount = scn.nextInt();
        
        if(amount>=500){
            note500 = amount/500;
            amount = amount % 500;
        }
        
       if(amount>=100){
            note100 = amount/100;
            amount = amount % 100;
        }
        if(amount>=50){
            
            note50 = amount/50;
            amount = amount % 50;
            
        }
        if(amount>=20){
            note20 = amount/20;
            amount = amount % 20;
        }
        if(amount>=10){
            note10 = amount/10;
            amount = amount % 10;
        }
        if(amount>=5){
            note5 = amount/5;
            amount = amount % 5;
        }
        if(amount>=2){
            note2 = amount/2;
            amount = amount % 2;
        }
        if(amount>=1){
            note1 = amount;
//            amount = amount-1;
        }
        
        System.out.println("500 : "+note500);
        System.out.println("100 : "+note100);
        System.out.println("50 : "+note50);
        System.out.println("20 : "+note20);
        System.out.println("10 : "+note10);
        System.out.println("5 : "+note5);
        System.out.println("2 : "+note2);
        System.out.println("1 : "+note1);
        
        
        
    }
    
}
