package weathe;

import java.util.Scanner;

public class Weathe {
    public static void main(String[] args) {
//        building a multidentional array
        double [][][] data=new double[10][24][2];
//        for initializing
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 10*24; i++) {
            int day=s.nextInt();
            int hour=s.nextInt();
            double temperature=s.nextDouble();
            double humadity=s.nextDouble();
            data[day-1][hour-1][0]=temperature;
            data[day-1][hour-1][1]=humadity;
        }
//        for  finding the sum to find average
        for (int i = 0; i < 10; i++) {
            double total_of_temp=0, total_of_humadity=0;
            for (int j = 0; j < 24; j++) {
                total_of_humadity+=data[i][j][1];
                total_of_temp+=data[i][j][0];
            }
            System.out.println("The days "+i+"'s average temperature is "+total_of_temp/24);
            System.out.println("The days "+i+"'s average humidity is "+total_of_humadity/24);
        }
        
    }
}
