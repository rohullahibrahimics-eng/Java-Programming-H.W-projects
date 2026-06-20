package chapter8;
public class chapter8_25 {
    public static void main(String[] args) {
        double[][] matrix={{0.15, 0.875, 0.375},
        {0.55, -0.005, 0.225},
        {0.30, 0.12 , 0.4}};
        System.out.println(is_Markov_matrix(matrix) ?"It is a Markov matrix" :"It is not a Markov matrix");
    }
    public static boolean is_Markov_matrix(double [][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            double sumOFColumn=0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i]<0){
                    return false;
                }
                sumOFColumn+=matrix[j][i];
            }
            if(sumOFColumn!=1){
                return false;
            }
        }
        return true;
    }
}
