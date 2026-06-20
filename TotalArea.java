package testcirclewithstaticmembers;

import java.util.Random;

public class TotalArea {
    public static void main(String []args){
       circle [] arraysOfcircle;
        
       arraysOfcircle=creat_circle();
        printing_array_of_objects(arraysOfcircle);
        
    }
    public static circle[] creat_circle(){
        circle[] creating_circle=new circle[5];
        for (int i = 0; i < creating_circle.length; i++) {
            creating_circle[i]=new circle((int)(Math.random()*100));
        }
        return creating_circle;
    }
    
    public static void printing_array_of_objects(circle[] arraysOfcircle ){
        System.out.printf("%-15s%-15s\n", "radius ","area");
        for (int i = 0; i < arraysOfcircle.length; i++) {
            System.out.printf("%-15s%-15s\n", arraysOfcircle[i].getRadius(),arraysOfcircle[i].getArea());
        }
        System.out.println("---------------------------------");
        System.out.println("The total area of circles is "+sum(arraysOfcircle));
    }
    
    public static double sum(circle[] arraysOfcircle){
        double sum=0;
        for (int i = 0; i <arraysOfcircle.length; i++) {
            sum+=arraysOfcircle[i].getArea();
        }
        return sum;
    }
    
    
}
