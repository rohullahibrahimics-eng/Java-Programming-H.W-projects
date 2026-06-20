
package varargsdemolisting7_5;

public class VarArgsDemoListing7_5 {

    public static void main(String[] args) {
        
        printMax(12,34,45,2);
        printMax(new double[] {1,2,3,4});
    }
    public static void printMax( double... numbers){
        if (numbers.length == 0){
            System.out.println("No input value detected!");
            return;
        }
        double maxValue = numbers[0];
        for (int i = 0 ; i < numbers.length; i++){
        if (numbers[i] > maxValue){
        maxValue = numbers[i];
        }
        }
        System.out.println("The max value is: " + maxValue);
    }
    
}
