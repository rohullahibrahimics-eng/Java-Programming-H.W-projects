
package gradeexam2darraylisting8_2;
import java.util.Scanner;
public class GradeExam2DArrayListing8_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] keyArray = {'D','B','D','C','C','D','A','E','A','D'};
        char[][] studentAnswersArray = 
        {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'}
        };
        int highestScore = 0;
        int lowestScore = 0;
        int firstPosition = 0;
        int lastPosition = 0;
        for (int row = 0; row < studentAnswersArray.length; row++){
        int rightAnswers = 0;
        int wrongAnswers = 0;
            for (int column = 0; column < studentAnswersArray[row].length; column++){
                if (studentAnswersArray[row][column] == keyArray[column])
                    rightAnswers++;
                else
                    wrongAnswers++;
            }
                if (rightAnswers > highestScore){
                    highestScore = rightAnswers;
                    firstPosition = row;
                }
                if (wrongAnswers > lowestScore){
                    lowestScore = wrongAnswers;
                    lastPosition = row;
                }
            System.out.println("Student[" + row +"] has " + rightAnswers + " right Answers and "
            + wrongAnswers + " wrong Answers!");
        }      
        System.out.println("The Student[" + firstPosition + "] is First Postion because he acheived the higest score " + highestScore +
                " And the Last Position is student[" + lastPosition + "] because he acheived the lowest Score " + lowestScore + "!");
        
    }
    
}
