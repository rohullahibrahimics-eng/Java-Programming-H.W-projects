
package computechangelisting2_10;
import java.util.Scanner;
public class ComputeChangeListing2_10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a dollar value! (e.g. 11.56) ");
        double userValue = input.nextDouble();
        int dollars = (int)(userValue * 100) / 100;
        int remainingCent = (int) Math.round(userValue * 100) % 100;
        int quarters = remainingCent / 25;
        remainingCent %= 25;
        int dimes = remainingCent / 10;
        remainingCent %= 10;
        int nickles = remainingCent / 5;
        int pennies = remainingCent % 5;
        
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");
    }
    
}
