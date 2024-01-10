/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.*;
/**
 *
 * @author sajeeb
 */
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            number.add(i, scn.nextInt());
        }
        for(int num:number){
            System.out.print(num+" ");
        }
         ArrayList<Integer> number2 = new ArrayList<>();
         number2.add(29);
         number2.add(83);
         number2.add(10);
         number2.add(20);
         number2.add(23);
         
         number2.removeAll(number);
         System.out.println();
         System.out.print(number2+" ");
         System.out.println("Index: "+number2.indexOf(83));
         number2.set(1, 38);
         System.out.print(number2+" ");
                 
    }
}
