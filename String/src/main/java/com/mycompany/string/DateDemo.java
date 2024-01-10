/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.string;
import java.text.*;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class DateDemo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Current Date: "+date);
        // Formating Date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
//        System.out.println(dateFormat);
        String formattedDate = dateFormat.format(date);
        System.out.println("Current Formatted Date: "+formattedDate);
    }
}
