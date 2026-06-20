package sodoku_1;
import java.awt.TextField;
public class Sodoku_1 {
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
        System.out.println(isValid(solution)?"Valid solution": "invalid solution");
        
    }
    public static boolean isValid(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]>9 || grid[i][j]<1){
                    return false;
                }
                if(!isValid_t(grid, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isValid_t(int[][] grad,int i,int j){
          //for checking rows element be unique
        for (int column = 0; column < grad[i].length; column++) {
            if(column!=j && grad[i][j]==grad[i][column]){
                return false;
            }
    }
        //for checking columns elements to be unique
           for (int row =0; row < grad.length; row++) {
            if(row!=i && grad[i][j]==grad[row][j]){
                return false;
            }
    }
//           for checking in a 3x3 box elements be unique
           for (int row =(i/3)*3 ; row <(i/3)*3+3; row++) {
               for (int column =(j/3)*3; column <(j/3)*3+3; column++) {
                   if( !(column==j && row==i) && grad[i][j]==grad[row][column] )
                       return false;
               }
        }
        return true;
    }
}
