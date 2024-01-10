/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author sajeeb
 */
public class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    
    private String name;
    private double height;
    private double weight;
    
    public BMI(String name, double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    public double BMICal(){
        
        double heightInMeter = (this.height * BMI.METERS_PER_INCH);
        double bmi = (this.weight * BMI.KILOGRAMS_PER_POUND)/Math.pow(heightInMeter,2);
        return bmi;
    }
    
    public String getStatus(){
        double bmi = BMICal();
        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi>25){
            return "Overweight";
        }
        else{
            return "Normal";
        }
    }
    public String getName(){
        return this.name;
    }
}
