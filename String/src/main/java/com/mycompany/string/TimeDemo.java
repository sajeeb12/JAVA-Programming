/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.string;
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class TimeDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(format);
        System.out.println("Current Local Time: "+formattedTime);
    }
}
