
package weatherlisting8_5;

import java.util.Scanner;

public class WeatherListing8_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    final int NUMBER_OF_DAYS = 10;
    final int NUMBER_OF_HOURS = 24;
    System.out.println("Please enter the values for each elements for this array!");
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
            for(int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++){
            int day = input.nextInt();
            int hour = input.nextInt();
            double temprature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day-1][hour-1][0] = temprature;
            data[day-1][hour-1][1] = humidity;
            }
        
        for (int i = 0; i < NUMBER_OF_DAYS; i++){
            double totalOfTemprature = 0;
            double totalOfHumidity = 0;
            double tempratureAverage = 0;
            double humidityAverage = 0;
                for (int j = 0; j < NUMBER_OF_HOURS; j++){
                    data[i][j][0] += totalOfTemprature;
                    data[i][j][1] += totalOfHumidity;
                }
                tempratureAverage = totalOfTemprature / 24;
                humidityAverage = totalOfHumidity / 24;
            System.out.println("Day " + (i+1) + "'s Temprature Average is " + tempratureAverage + " and Humidity Avarage is " + humidityAverage);
        }
    }
    
}
