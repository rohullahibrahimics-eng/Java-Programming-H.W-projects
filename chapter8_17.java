package chapter8;
public class chapter8_17 {
    public static void main(String[] args){
        int numb_bank=5;
        int limitation=0;
        double[][] banks={
//            {25,2 ,1 ,100.5 ,4 ,320.5},         // 0
//            {125 ,2,2,40,3,85},                     // 1
//            {175, 2, 0, 125, 3, 75},                //2
//            {75, 1, 0, 125},                            //3
//            {181, 1, 2, 125}};                        //4
            
            {25,1 ,3 ,100.5 },         // 0
            {125 ,1,2,40,3,85},                     // 1
            {175, 1, 0, 125, 3, 75},                //2
            {75, 1, 0, 125},                            //3
            {181, 1, 2, 125}};                        //4
        
        for (int i = 0; i < banks.length; i++) {
            if(banks[i][1]==1)
            {
            if(banks[i][0]+banks[i][3]<limitation){
                banks[i][0]=-10;
                for (int j = 0; j < banks.length; j++) {
                    if(banks[j][2]==i){
                            banks[j][3]=0;
                            if(banks[j][0]<limitation){
                            banks[j][0]=-10;
                            System.out.println("The bank number "+j+ " is unsaved.");
                            }
                    }
                }
            }
            }
            if(banks[i][0]==-10){
                System.out.println("The bank number "+i+" is unsafed");
            }
        }
    }
   
}
