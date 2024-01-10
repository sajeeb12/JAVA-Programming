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
public class Installment {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numberOfInstallment;
        
        int price = 1800;
        
        System.out.print("How Many Installment You Want: ");
        numberOfInstallment = scn.nextInt();
        
        double installmentPerMonth1 = (double) price/ numberOfInstallment;
        System.out.println("Your Installment per Month is: "+installmentPerMonth1 + " euros");
        
    }
}
