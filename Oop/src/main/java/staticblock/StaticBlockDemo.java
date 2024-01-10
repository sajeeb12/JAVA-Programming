/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticblock;

/**
 *
 * @author sajeeb
 */
public class StaticBlockDemo {
    static int id;
    static String name;
    
    static{
        id = 101;
        name = "Sajeeb";
    }
    static void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
}
