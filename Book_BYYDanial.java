
package book_by.y.danial;

import java.util.Scanner;

public class Book_BYYDanial {
    public static void main(String[] args) {
        int [][] n=getArray();
        display_Array(n);
    }
    public static int[][] getArray(){
        Scanner s=new Scanner(System.in);
        int [][]n=new int[3][4]; 
        System.out.println("Enter "+n.length+" rows and "+n[0].length+" columns");
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[0].length;j++){
                n[i][j]=s.nextInt();
            }
        }
        return n;  
    }
    public static void display_Array(int[][] n){
         int sum=0;
         for(int i=0;i<n.length;i++){
            for(int j=0;j<n[0].length;j++){
                System.out.print(n[i][j]+"    ");
                sum+=n[i][j];
            }
             System.out.println();
        }
         System.out.println("the sum is: "+sum);
    }
    
}
