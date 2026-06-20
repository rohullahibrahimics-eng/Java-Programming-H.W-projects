package chapter8;
public class chapter8_27 {
     public static void main(String[] args) {
        int[][] matrix={
            {4,3,6,8,5},
            {4,6,8,88,65},
            {44,54,22,3,2}};
        
         for (int column = 0; column < matrix[0].length; column++) {
             
             for (int i = 0; i < matrix.length; i++) {
                 for (int j = i+1; j < matrix.length; j++) {
                     if(matrix[i][column]>matrix[j][column]){
                         int temp=matrix[i][column];
                         matrix[i][column]=matrix[j][column];
                         matrix[j][column]=temp;
                     }
                 }
             }
             
             
             for (int i = 0; i < matrix.length; i++) {
                 System.out.print(matrix[i][column]+"    ");
             }
             System.out.println();
             
         }
        
        
        
     }
}
