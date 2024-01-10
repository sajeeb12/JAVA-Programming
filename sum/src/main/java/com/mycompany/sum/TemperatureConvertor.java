/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sum;
import java.util.*;

/**
 *
 * @author sajeeb
 */
public class TemperatureConvertor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double f;
        System.out.print("Enter Fahreinheight Value: ");
        f = scn.nextDouble();
        double c = (f-32)* 0.55;
        System.out.printf("%f degree fahreinheight is %f Celcius degree",f,c);
    }
    
    
}
