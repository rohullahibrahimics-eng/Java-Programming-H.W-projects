/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmiclass;

public class Bmi {
    double weight;
    double height;
     double bmi=weight/(height*height);
    public Bmi(double weight,double height) {
        this.weight=weight;
        this.height=height;
    }
     
        

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBmi() {
        return bmi;
    }
    
    public String state(){
        if (bmi<18.5)
            return "Underweight";
        if (bmi>=18.5 && bmi<25.0)
            return "Normal";
      if (bmi>=25.0 && bmi<30.0)
            return "Overweight ";
        if (bmi>30.0)
            return "obese ";
        return "";
    }
}
