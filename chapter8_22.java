package chapter8;
public class chapter8_22 {
    public static void main(String[] args){
        
        int [][] numbers=new int[6][6];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j]=(int)(Math.random()*2);
                System.out.print(numbers[i][j]+"    ");
            }
            System.out.println();
        }
        
        System.out.println();
//        for row checking
        int sum_one=0;
        for (int i = 0; i < numbers.length; i++) {
            sum_one=0;
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]==1){
                    sum_one++;
                }
            }
            if(sum_one%2==0){
                System.out.println("The row "+i+" has even 1");
            }
        }
        System.out.println();
//        for column checking
int sum_one_column=0;
        for (int i = 0; i < numbers[0].length; i++) {
            sum_one_column=0;
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j][i]==1){
                    sum_one_column++;
                }
            }
            if(sum_one_column%2==0){
                System.out.println("The column "+i+" has even  1");
            }
        }
    }
    
}
