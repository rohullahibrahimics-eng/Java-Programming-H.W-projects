
package chapter;
//import java.util.Scanner;
public class Chapter2ProgrammingExercises {

    public static void main(String[] args) {
        /* This is the exercise of the chpater Two of the Introduction to 
        JAVA Programming and Data Structure. 12th edition.
        */

      // Ques 2.1
      //  Scanner input = new Scanner (System.in);
      //  System.out.println("Please enter a degree in Celsuis!");
      //  double Celsius = input.nextDouble();
      // double Fahrenheit = ((9.0/5) * Celsius + 32);
      //  System.out.println( Celsius + " Celsius Degree is " + Fahrenheit +" Fahrenheit degree!");
        
      int[] myList = {1,2,3,4};
      int temp = myList[0];
      for (int i = 0; i < myList.length-1; i++){
      myList[i] = myList[i+1];
      }
      myList[myList.length-1] = temp;
      for (int i = 0 ; i < myList.length; i++){
          System.out.println(myList[i]);
      }
        
        
        
    }
    
}
