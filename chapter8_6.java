package chapter8;
public class chapter8_6 {
        public static void main(String[] args) {
         double [][] matrix1={{1,2,3},{4,5,6}};
         double [][] matrix2={{7,8},{9,10},{11,12}};
         System.out.println("The multiplication of the tow matrix is :");
            for (int i = 0; i < multiplyMatrix(matrix1, matrix2).length; i++) {
                for (int j = 0; j < multiplyMatrix(matrix1, matrix2)[0].length; j++) {
                    System.out.print(multiplyMatrix(matrix1, matrix2)[i][j]+"   ");
                }
                System.out.println();
            }
            
         
            
        }
        
        public static double[][]  multiplyMatrix(double[][] a, double[][] b){
            double [][] result=new double[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
               int k=0;
                while(k<b[0].length){
                    int  j=0;
                    double sum=0;
                for (j = 0; j<b.length ;j++) {
                   sum=sum+(a[i][j]*b[j][k]);
                }
                result[i][k]=sum;
                k++;
                }
                
            }
            
       return result;
        }
}
