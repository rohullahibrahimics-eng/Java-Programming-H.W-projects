
package listing2.pkg6fahrenheittocelsius;
import java.util.Scanner;
public class Listing26FahrenheitToCelsius {

    public static void main(String[] args) {
     /*   // This is the exercises of listing 2.6 Converting a Fahrenheit degree to Celsius degree!
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a valid Fahrenheit degree to convert it to Celsius!");
        double fahrenheit = input.nextDouble();
        double celsius = ((5.0/9) * (fahrenheit - 32));
        System.out.println("The Fahrenheit degree you entered can be " + celsius + " Cesius degree!");
        */
        // This is the exercise of the chapter two and we want to solve a problem.
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        byte currentSeconds = (byte)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        byte currentMinutesGMT = (byte)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        byte currentHoursGMT = (byte)(totalHours % 12); // You can write 24 instead of 12 if you want to show the Iranian hour!
        System.out.println("The current time for GMT is " + currentHoursGMT + " : " + 
                currentMinutesGMT + " : " + currentSeconds);
        
        // I want to show the current time for Afghanistan!
        byte currentHoursAFG = (byte)(currentHoursGMT + 4);
        if (currentHoursAFG > 12){
        currentHoursAFG -= 12;
        }
        byte currentMinutesAFG = (byte)(currentMinutesGMT + 30);
        if (currentMinutesAFG >= 60){
        currentMinutesAFG -= 60;
        }
        
        System.out.println("The current time for Afghanistan is " + currentHoursAFG + " : " +
                currentMinutesAFG + " : " + currentSeconds); 
    }   
    
}
 