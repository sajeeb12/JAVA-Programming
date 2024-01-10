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
public class SortArrayList {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter Value no. %d: ",i+1);
            list.add(i,scn.nextInt());
            System.out.println();
        }
        Collections.sort(list);
        
        System.out.println("Ascending List: "+list);
        
        
    }
}
