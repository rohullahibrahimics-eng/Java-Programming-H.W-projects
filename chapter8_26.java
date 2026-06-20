package chapter8;
public class chapter8_26 {
    public static void main(String[] args) {
        int[][] matrix={
            {4,3,6,8,5},
            {4,6,8,88,65},
            {44,54,22,3,2}};
        
        for (int row = 0; row < matrix.length; row++) {
            
            for (int i = 0; i <matrix[0].length; i++) {
                for (int j = i+1; j <matrix[0].length; j++) {
                    if(matrix[row][i]>matrix[row][j]){
                        int tmep=matrix[row][i];
                        matrix[row][i]=matrix[row][j];
                        matrix[row][j]=tmep;
                    }
                }
            }
            
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[row][i]+"   ");
            }
            System.out.println();
        }
        
        
        
    }
}
