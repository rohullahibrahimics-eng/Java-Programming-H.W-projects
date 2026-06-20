package chapter8;

import java.util.Scanner;

public class chapter8_5 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
        System.out.println("Enter Matrix 1:");
        double [][]array1=new double[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j]=s.nextInt();
            }
        }
        
          System.out.println("Enter Matrix 2:");
        double [][]array2=new double[3][3];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j]=s.nextInt();
            }
        }
        
        System.out.println("The matrix are added as follow: ");
        for (int i = 0; i < suming_matrix(array1, array2).length; i++) {
            for (int j = 0; j < suming_matrix(array1, array2)[i].length; j++) {
                System.out.print(array1[i][j]+" "+array2[i][j]+"    " + suming_matrix(array1, array2)[i][j]+"   ");
                System.out.print(suming_matrix(array1, array2)[i][j]+"  ");
            }
            System.out.println();
        }
        
        
        
    }
    public static double [][] suming_matrix(double[][] array1, double [][] array2){
        double [][] sum_array=new double[array1.length][array1[0].length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    sum_array[i][j]=array1[i][j]+array2[i][j];
                }
        }
            return sum_array;
    }
    
}
