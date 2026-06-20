package chapter8;
public class chapter8_3 {
    public static void main(String[] args){
           char [][] answers={{'A','B','A','C','C', 'D', 'E', 'E', 'A', 'D'},
                            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'} ,
                              {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'} ,
                              {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'} ,
                              {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} ,
                               {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} ,
                               {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} ,
                                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} };
           
           char [] correctKeys={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
           int [] counter=new int[answers.length];
         for (int i = 0; i < answers.length; i++) {
              counter[i]=0;
             for (int j = 0; j < answers[i].length; j++) {
                 if(answers[i][j]==correctKeys[j]){
                 counter[i]++;
                 }
             }
         System.out.println("The student number "+i+" had solved "+counter[i]+" questions");
        }
         System.out.println();
        int[] index_of_student=new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            index_of_student[i]=i;
        }
          for (int i = 0; i < answers.length; i++) {
             for (int j = i+1; j < answers.length; j++) {
                 if(counter[i]<counter[j]){
                 int temp=counter[i];
                 counter[i]=counter[j];
                 counter[j]=temp;
//                 swap the student index;
                int tempo=index_of_student[i];
                index_of_student[i]=index_of_student[j];
                index_of_student[j]=tempo;
                 }
             }
               System.out.println("The student number "+index_of_student[i]+" had solved "+counter[i]+" questions");
        }
         
    }
    
}
