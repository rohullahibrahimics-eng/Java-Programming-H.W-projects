
package analyizenumberslisting7_1;
import java.util.Scanner;
public class AnalyizeNumbersListing7_1 {

    public static void main(String[] args) {
        // Case Study : Analizing Numbers
          Scanner input = new Scanner (System.in);
        System.out.println("Please enter the number of elements!");
        int numOfElements = input.nextInt();
        double[] caseStudy = new double [numOfElements];
        System.out.println("Please enter " + numOfElements + " Elements");
        for (int i = 0 ; i < caseStudy.length; i++){
            caseStudy[i] = input.nextInt();
        }
        double sum = 0;
        for(double x : caseStudy){
        sum += x;
        }
        double average = 0;
        average = sum / caseStudy.length;
        int aboveAverage = 0;
        for(int i = 0 ; i < caseStudy.length; i++){
            if (caseStudy[i] > average){
                aboveAverage++;
        }
        }
        System.out.println("The average of your numbers is : " + average);
        System.out.println("The amount of the numbers which are above the average! is : " + aboveAverage); 
    }
    
}
