
package checksudokusolutionlisting8_4;
import java.util.Scanner;
public class CheckSudokuSolutionListing8_4 {

    public static void main(String[] args) {
        // In this program we will learn the Sudoku Solution!
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "Valid Solution" : "InValid Solution");
    }
    public static int[][] readASolution(){
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter each element of your optional Soduku in order of a row (e.g: 1 2 3 4 5 6 7 8 9)!");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9 ; i++)
            for (int j = 0 ; i < 9; j++)
            grid[i][j] = input.nextInt();
        return grid;
    }
        public static boolean isValid(int[][] grid){
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i,j,grid))
                    return false;
        return true;
    }
    public static boolean isValid(int i, int j, int[][] grid){
        // check whether grid[i][j] is unique in i's row!
        for (int column = 0; column < 9; column++)
            if (column != j && grid[i][column] == grid[i][j])
                return false;
        // check whether grid[i][j] is unique in j's column!
        for (int row = 0; row < 9; row++)
            if (row != 0 && grid[row][j] == grid[i][j])
                return false;
        //check whether grid[i][j] is unique in the 3x3 box!
        for (int row = (i/3) * 3; row < (i/3) * 3 + 3; row++)
            for(int column = (j/3) * 3; column < (j/3) * 3 + 3; column++)
                if(!(row == i && column == j) && grid[row][column] == grid[i][j])
                    return false;
        return true; // It means that the current value at grid[i][j] is valid!   
    }

    
}
