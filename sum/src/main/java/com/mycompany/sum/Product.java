/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sum;
import java.util.Scanner;

/**
 *
 * @author sajeeb
 */
public class Product {
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int id,price;
        String title,desc,category;
        System.out.println("Enter Id:");
        id = scn.nextInt();
        scn.nextLine();
        
        System.out.println("Enter Title");
        title = scn.nextLine();
        
        System.out.println("Enter The Price:");
        price = scn.nextInt();
        scn.nextLine();
        
        
        System.out.println("Enter Description:");
        desc = scn.nextLine();
        
        System.out.println("Enter Category:");
        category = scn.nextLine();
        
        
        System.out.println("id: "+id);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Description: "+desc);
        System.out.println("Category: "+category);
        
        
        
        
        
    }
    
}