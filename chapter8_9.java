package chapter8;
import java.util.Scanner;
public class chapter8_9 {
     public static void main(String[] args) {
         
        Scanner s= new Scanner(System.in);
        String [][] table={{"| ","| ","| ","| "},{"| ","| ","| ","| "},{"| ","| ","| ","| "}};
        int m=1;
        int counter=0;
        
        while(counter==0){
            
         for (int i = 0; i < table.length; i++) {
               System.out.println("-------\n"+table[i][0]+table[i][1]+table[i][2]+table[i][3]);
         }
         System.out.println("-------\n");
         
          if(is_lined(table)){
              if(m%2==0){
             System.out.println(" X Win the game.");
              }
              else {
                  System.out.println("O win the game.");
              }
             break;
         }
          
        
         if(m%2!=0){
         System.out.print("Enter a row (0, 1, or 2) for player X: ");
         int row=s.nextInt();
         System.out.print("Enter a column (0, 1, or 2) for player X: ");
         int column=s.nextInt();
        table[row][column]=table[row][column].replace(table[row][column].charAt(1)+"", "X");
         }
         else{
         System.out.print("Enter a row (0, 1, or 2) for player O: ");
         int row=s.nextInt();
         System.out.print("Enter a column (0, 1, or 2) for player O: ");
         int column=s.nextInt();
        table[row][column]=table[row][column].replace(table[row][column].charAt(1)+"", "O");
         }
         m++;
        }
     }
     public static boolean is_lined(String [][] table){
          if(table[0][0].charAt(1)==table[0][1].charAt(1) && table[0][0].charAt(1)==table[0][2].charAt(1) && table[0][0].charAt(1)!=' ' ||
             table[1][0].charAt(1)==table[1][1].charAt(1) && table[1][0].charAt(1)==table[1][2].charAt(1)  && table[1][0].charAt(1)!=' ' ||
             table[2][0].charAt(1)==table[2][1].charAt(1) && table[2][0].charAt(1)==table[2][2].charAt(1) && table[2][0].charAt(1)!=' ' ||
             table[0][0].charAt(1)==table[1][0].charAt(1) && table[0][0].charAt(1)==table[2][0].charAt(1) && table[0][0].charAt(1)!=' ' ||
             table[0][1].charAt(1)==table[1][1].charAt(1) && table[0][1].charAt(1)==table[2][1].charAt(1)  && table[0][1].charAt(1)!=' '  ||
             table[0][2].charAt(1)==table[1][2].charAt(1) && table[0][2].charAt(1)==table[2][2].charAt(1)  && table[0][2].charAt(1)!=' ' ||
             table[0][0].charAt(1)==table[1][1].charAt(1) && table[0][0].charAt(1)==table[2][2].charAt(1) && table[0][0].charAt(1)!=' '  ||
             table[2][0].charAt(1)==table[1][1].charAt(1) && table[2][0].charAt(1)==table[0][2].charAt(1) && table[2][0].charAt(1)!=' '  ){
         return true;
         }
         return false;
     }
}
