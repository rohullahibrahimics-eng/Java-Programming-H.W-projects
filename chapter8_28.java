package chapter8;
public class chapter8_28 {
    public static void main(String[] args) {
          int[][] m1={
            {4,3,6,8,5},
            {4,6,8,88,65},
            {44,54,22,3,2}};
          
            int[][] m2={
            {4,3,6,8,5},
            {4,6,8,88,65}};
            
            
        System.out.println(strickly_identical(m1, m2));
    }
    public static boolean strickly_identical(int [][] m1, int[][] m2){
        for (int i = 0; i < m1.length &&  i<m2.length ; i++) {
            for (int j = 0; j < m1[i].length && j < m2[i].length ; j++) {
                if(m1[i][j]!=m2[i][j])
                    return false;
            }
        }
        return true;
    }
}
