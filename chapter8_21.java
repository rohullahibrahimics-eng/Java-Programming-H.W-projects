package chapter8;
import java.util.Scanner;
public class chapter8_21 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        int number_city=s.nextInt();
        double[][] cordinats=new double[number_city][2];
        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < cordinats.length; i++) {
                    cordinats[i][0]=s.nextDouble();
                    cordinats[i][1]=s.nextDouble();
        }
        System.out.println("The centeral city is at ("+centeral_city(cordinats)[0]+","+centeral_city(cordinats)[1]+")");
        System.out.println("And the total distance to other cities are "+centeral_city(cordinats)[2]);
    }
    public static double[] centeral_city(double [][] cordinats){
        double[] centeral_coordinats=new double[3];
        double total_distance=0;
        double shortest_distance=100000;
        for (int i = 0; i < cordinats.length; i++) {
            total_distance=0;
            for (int j = 0; j < cordinats.length; j++) {
                double distance_first=Math.sqrt(Math.pow(cordinats[j][0]-cordinats[i][0], 2)+Math.pow(cordinats[j][1]-cordinats[i][1], 2));
                total_distance+=distance_first;
            }
            if(shortest_distance>total_distance){
                centeral_coordinats[0]=cordinats[i][0];
                centeral_coordinats[1]=cordinats[i][1];
                centeral_coordinats[2]=total_distance;
                shortest_distance=total_distance;
            }
        }
        return centeral_coordinats;
    }
}
