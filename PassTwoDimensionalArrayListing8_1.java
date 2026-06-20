
package passtwodimensionalarraylisting8_1;
import java.util.Scanner;
public class PassTwoDimensionalArrayListing8_1 {

    public static void main(String[] args) {
        int[][] userArray = getArray();
        System.out.println("Each of the elements of the array below is created by you!");
            for (int i = 0; i < userArray.length; i++){
                for (int j = 0; j < userArray[0].length; j++){
                    System.out.print(userArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Sum of all elements of this array is : " + sumOf2DArr(userArray));
    }
    
    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows!");
        int numOfRows = input.nextInt();
        System.out.println("Please enter the number of columns!");
        int numOfColumns = input.nextInt();
        int[][] gtArr = new int[numOfRows][numOfColumns];
        System.out.println("Now please enter each elements of this array!");
            for (int i = 0; i < gtArr.length; i++){
                for (int j = 0; j < gtArr[0].length; j++){
                    gtArr[i][j] = input.nextInt();
                }
            }
    return gtArr;
    }
    
    public static int sumOf2DArr(int[][] userArray){
    int total = 0;
        for (int i = 0; i < userArray.length; i++){
            for (int j = 0; j < userArray[0].length; j++){
            total += userArray[i][j];
            }
        }
        return total;
    }
    
}
