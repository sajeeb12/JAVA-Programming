/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author sajeeb
 */
public class Test {
    public static void main(String[] args) {
        BMI p1 = new BMI("Sajeeb",70,145);
        System.out.println("The BMI For "+p1.getName()+" is ("+p1.BMICal()+" )"+" "+p1.getStatus());
//        p1.displayBMI();
    }
}
