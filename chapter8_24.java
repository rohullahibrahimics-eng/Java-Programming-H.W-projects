package chapter8;
public class chapter8_24 {
    public static void main(String[] args) {
        int[][] solution={{9 ,6 ,3 ,1 ,7 ,4, 2, 5, 8},
            {1, 7, 8, 3, 2, 5, 6, 4, 9},
            {2,5 ,4, 6, 8, 9, 7, 3, 1},
            {8 ,2 ,1, 4 ,3 ,7 ,5 ,9 ,6},
            {4, 9 ,6 ,8 ,5 ,2 ,3 ,1, 7},
            {7 ,3 ,5 ,9 ,6, 1, 8, 2 ,4},
            {5 ,8 ,9, 7 ,1 ,3 ,4 ,6 ,2},
            {3 ,1 ,7 ,2 ,4 ,6 ,9 ,8 ,5},
            {6 ,4, 2, 5 ,9 ,8 ,1 ,7 ,3}};
        System.out.println(isValid(solution));
        
    }
    public static boolean isValid(int [][] grade){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(grade[i][j]>9 || grade[i][j]<1){
                    return false;
                }
                if(!isValid_t(grade, i, j)){
                    return false;
                }      
            }   
        }
        return true;
    }
    
    public static boolean isValid_t(int [][] grade ,int i, int j){
        
        for (int k = 0; k <9; k++) {
            if(j!=k && grade[i][j]==grade[i][k])
                return false;
        }
        
        for (int k = 0; k < 9; k++) {
            if(i!=k && grade[i][j]==grade[k][j])
                return false;
        }
        
        for (int k =(i/3)*3; k <(i/3)*3+3; k++) {
            for (int l =(j/3)*3 ; l <(j/3)*3+3; l++) {
                if(!(i==k && j==l) && grade[k][l]==grade[i][j])
                    return false;
            }
        }
    return true;
}
}
