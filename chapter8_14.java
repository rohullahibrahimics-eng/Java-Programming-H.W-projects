package chapter8;
import java.util.Scanner;
public class chapter8_14 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter  the size of the matrix : ");
        int size=s.nextInt();
        int [][] matrix=new int[size][size];
        
        initializing_matrix(matrix);
        display_matrix(matrix);
        same_row(matrix);
        same_columns(matrix);
        same_major_diagonal(matrix);
        same_sub_diagonal(matrix);
        
    }
    
    public static int[][] initializing_matrix(int [][] matrix ){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int)(0+Math.random()*2);
            }
        }
        return matrix;
    }
    
    public static void display_matrix(int [][] matrix ){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void same_row(int [][]matrix){
            int counter=0;
            int content=0;
            int counter_2=0;
         for (int i = 0; i < matrix.length; i++) {
             counter=1;
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[i][j]==matrix[i][j+1]){
                    counter++;
                    content=matrix[i][j];
                }
            }
            if(counter==matrix.length){
                System.out.println("All "+content+"s on row "+(i+1));
                counter_2++;
            }
        }
         if(counter_2==0){
             System.out.println("No same numbers on a row.");
         }
    }
    
    public static void same_columns(int [][]matrix){
        int counter=0;
        int content=0;
        int counter_2=0;
         for (int i = 0; i < matrix.length; i++) {
             counter=1;
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[j][i]==matrix[j+1][i]){
                    counter++;
                    content=matrix[j][i];
                }
            }
            if(counter==matrix.length){
                System.out.println("All "+content+"s on column "+(i+1));
                counter_2++;
            }
        }
         if(counter_2==0){
             System.out.println("NO same numbers on the column.");
         }
    }
    
    public static void same_major_diagonal(int [][]matrix){
        int  counter=1;
        int content=0;
        for (int i = 0; i < matrix.length-1; i++) {
            if(matrix[i][i]==matrix[i+1][i+1]){
                counter++;
                content=matrix[i][i];
            }
        }
        if(counter==matrix.length){
                System.out.println("All "+content+"s on major diagonal.");
        }
        else {
                System.out.println("No same numbers on the major diagonal");
        }
    }
    
     public static void same_sub_diagonal(int [][]matrix){
         int counter=1;
         int content=0;
         for (int i = 0 , j=matrix.length-1; i < matrix.length-1; i++,j--) {
             if(matrix[i][j]==matrix[i+1][j-1]){
                 counter++;
                 content=matrix[i][j];
             }
         }
         if(counter==matrix.length){
            System.out.println("All "+content+"s on sub major");
        }
        else{
            System.out.println("No same numbers on the sub_diagonal");
        }
     }
}
