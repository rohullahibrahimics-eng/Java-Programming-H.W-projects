package chapter8;

import java.util.Scanner;

public class Chapter8_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double[][] matrix=new double [3][4];
        System.out.print("Enter a 3x4 matrix:");
        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j <matrix[i].length; j++) {
                matrix[i][j]=s.nextDouble();
            }
        }
        System.out.println(sum_column(matrix, 2));
        
        
    }
    public static double sum_column(double[][] matrix, int column_index ){
        double sum=0;
                    for (int j = 0; j < matrix.length; j++) {
                        sum+=matrix[j][column_index];
                }
                    return sum;
    }
}
