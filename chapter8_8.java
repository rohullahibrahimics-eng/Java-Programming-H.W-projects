package chapter8;

import java.util.Scanner;

public class chapter8_8 {
        public static void main(String [] args){
            Scanner s=new Scanner(System.in);
            System.out.print("Enter  number of points :");
            int number_of_points=s.nextInt();
//        double [][] points={{0,0},{1,1},{-1,-1},{2,2},{-2,-2},{-3,-3},{-4,-4},{5,5}};
            double[][] points=new double[number_of_points][2];
            System.out.print("Enter "+number_of_points+" points: ");
            for (int i = 0; i <points.length; i++) {
                points[i][0]=s.nextDouble();
                points[i][1]=s.nextDouble();
            }
        double result=0;
        double minumun=1000000000;
        double[][] min_points=new double[points.length][2];
            for (int i = 0; i < points.length; i++) {
                    for (int j = i+1; j < points.length; j++) {
                         result=Math.pow(    Math.pow(points[j][0]-points[i][0],2)+Math.pow(points[j][1]-points[i][1],2)   , 0.5    );
                         if(result<minumun || result==minumun){
                             minumun=result;
                             min_points[0][0]=points[i][0];
                             min_points[0][1]=points[i][1];
                             min_points[1][0]=points[j][0];
                             min_points[1][1]=points[j][1];
                             System.out.println("The closest tow points are  ( "+ min_points[0][0]+" , "+min_points[0][1]+" ) and ( "+ min_points[1][0]+" , "+min_points[1][1]+" ) ");
                           }
                }
            }
            System.out.println("Their distance is "+minumun);
        }
    
}
