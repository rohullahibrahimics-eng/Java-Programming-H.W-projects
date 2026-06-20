package chapter8;
import java.util.Random;
import java.util.Scanner;
public class chapter8_35 {
     public static void main(String[] args){
         Scanner k=new Scanner(System.in);
         System.out.println("Enter number of rows");
         int row=k.nextInt();
         
         
         
         
         
         
         
         
     }
     public static int [][] making_random_1_0_matrix(int row){
         int [][] matrix=new int[row][row];
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < row; j++) {
                 matrix[i][j]=(int)(Math.random()*2);
             }
         }
         return matrix;
     }
     
     public static int[]  largest_block(int [][] matrix){
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 
             }
         }
     }
}
