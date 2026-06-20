package chapter8;
import java.util.Scanner;
public class chapter8_13 {
      public static void main(String[] args) {  
      Scanner s=new Scanner(System.in);
          System.out.print("Enter the number of rows and columns of the array: ");
          double[][] array=new double[s.nextInt()][s.nextInt()];
          System.out.print("Enter the array: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j]=s.nextDouble();
                }
        }
          System.out.println("The location of the largest element is at ("+find_largest_index(array)[0]+" , "+find_largest_index(array)[1]+" )");
      }
    public static int[] find_largest_index(double[][] array){
        double max=0;
        int[] index_max=new int[2];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(max<array[i][j]){
                        max=array[i][j];
                        index_max[0]=i;
                        index_max[1]=j;
                    }
                }
        }
    return index_max;
    }
}
