package chapter8;
public class chapter8_10 {
     public static void main(String[] args) {  
        int [][] matrix=new int[4][4];
        int count_one_row=0;
        int  count_one_column=0;
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
                 matrix[i][j]=(int)(0+Math.random()*2);
                 System.out.print(matrix[i][j]);
             }
             System.out.println();
         }
         
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
             if(matrix[j][i]==1){
             count_one_row++;
             }
             if(matrix[i][j]==1){
             count_one_column++;
             }
             }
         }
         System.out.println("The largest row index: "+count_one_row);
         System.out.println("The largest column index: "+count_one_column);
     }
}
