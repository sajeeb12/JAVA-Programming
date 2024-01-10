/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxModel;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Box {
    double height;
    double width;
    double depth;
    
    Box(){
        
    }
    Box(double height,double width,double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void displayVolumeofBox(){
        double volume;
        volume = this.height * this.width *this.depth;
        System.out.println("Volume of Box: "+volume);
    }
}
