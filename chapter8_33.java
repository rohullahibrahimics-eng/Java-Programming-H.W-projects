/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter8;

/**
 *
 * @author Mohammad Asif
 */
public class chapter8_33 {
    public static void main(String[] args){
        double [][] points={{1,1},{2,2},{3,3}};
        if(on_same_line(points)){
            System.out.println("The five points are on the same line ");
        }
        else{
            System.out.println("The five points are not on the same line");
        }
    }
    public static boolean  on_same_line(double[][] points){
        double slop1=(points[1][1]-points[0][1])/(points[1][0]-points[0][0]);
        double slop2=(points[2][1]-points[0][1])/(points[2][0]-points[0][0]);
        if(slop1==slop1)
            return true;
        else 
            return false;   
    }
    
}
