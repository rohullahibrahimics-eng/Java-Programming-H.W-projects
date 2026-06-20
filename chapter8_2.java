package chapter8;

import java.util.Scanner;

public class chapter8_2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double[][] matrix=new double[4][4];
        System.out.println("Enter a 4x4 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=s.nextDouble();
            }
        }
        System.out.println("The sum of original major is "+sum_of_original_major(matrix));
    }
    public static double sum_of_original_major(double[][] matrix){
        double sum=0;
        for (int i = 0; i < matrix.length; i++) {
                sum+=matrix[i][i];
        }
        return sum;
    }
}
