package chapter8;

import org.w3c.dom.css.Counter;

public class chapter8_19 {
     public static void main(String [] args)
     {
         int[][] a={{1,5,3,4,1},
                        {1,2,2,1,2},  
                        {1,2,1,2,3}, 
                        {2,1,2,1,2}, 
                        {1,2,4,3,1},  
                        {2,1,7,3,2}, 
                        {1,2,4,5,7}};
         
         System.out.println(isConsecutiveFour(a));
     }
     public static boolean isConsecutiveFour(int[][] a){
         // for four consecutive in a single row
         int row_counter=1;
         for (int i = 0; i <a.length; i++) {
             for (int j = 0; j <a[i].length-1; j++) {
             if(a[i][j]==a[i][j+1]){
                 row_counter++;
                 if(row_counter>=4){
                     return true;
                 }
             }
             else{
                    row_counter=1;
             }
             }
         }

//          for four consecutive column
        int column_counter=1;
         for (int i = 0; i <a[i].length; i++) {
             column_counter=1;
             for (int j = 0; j < a.length-1; j++) {
                 if(a[j][i]==a[j+1][i]){
                     column_counter++;
                     if(column_counter>=4){
                     return true;
                     }
                 }
                 else {
                 column_counter=1;
                 }
             }
         }
         
//       for diagnal consecutive  main diagonal and also anti_diagonal
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j <a[i].length; j++) {
                 if(i<=a.length-4 && j<=a[i].length-4){
                 if(a[i][j]==a[i+1][j+1] && a[i][j]==a[i+2][j+2] &&  a[i][j]==a[i+3][j+3] ){
                     return true;
                 }
                 }
//                 anti diagonal 
                if(i<=a.length-4 && j>=3){
                if(a[i][j]==a[i+1][j-1] &&
                   a[i][j]==a[i+2][j-2] && 
                   a[i][j]==a[i+3][j-3] ){
                     return true;
                 }
             }
                 }
         }
         
         
         
         
     return false;
     }
     }

