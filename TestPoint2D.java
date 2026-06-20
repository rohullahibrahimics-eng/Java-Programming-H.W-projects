package testpoint2d;
//import  java.javafx.geometry.Point2D;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        
     Scanner s=new Scanner(System.in);
        System.out.print("Enter cordinats for point 1 : ");
        double x1=s.nextDouble();
        double y1=s.nextDouble();
         System.out.print("Enter cordinats for point 2 : ");
        double x2=s.nextDouble();
        double y2=s.nextDouble();
        
        Point2D piont1=new Point2D() {
         @Override
         public double getX() {
             return x1;
         }

         @Override
         public double getY() {
            return y1;
         }

         @Override
         public void setLocation(double x, double y) {
             System.out.println("[x = "+x1+" and  y = "+y1+" ]");
         }
        };
        
        System.out.println("point 1 is "+piont1.toString());
        
        Point2D piont2=new Point2D() {
         @Override
         public double getX() {
           return x2;
         }

         @Override
         public double getY() {
            return y2;
         }

         @Override
         public void setLocation(double x, double y) {
            System.out.println("[x = "+x2+" and  y = "+y2+" ]");
         }
        };
        
        System.out.println("The piont 2 is "+piont2);
        
        System.out.println("The distance amonge poin1 and point 2 is "+piont1.distance(piont2));
        System.out.println("The  middiastnace among piont1 and piont 2 is  : The midpiont did not found ");
        
        
        
        
        
        
        
        
        
        
    }
    
}
