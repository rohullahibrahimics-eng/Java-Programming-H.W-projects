

package countingsort;

import java.util.Scanner;

public class CountingSort {

    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
        
    int[] a = new int [6];
    
    for(int i = 0 ;i < a.length;i++)
        a[i] = input.nextInt();
    
    countingSort(a);
    
    }
    public static void countingSort(int[] a){
        int max = a[0];
        
        for(int i = 0 ;i < a.length ;i++){
                if(a[i] > max){
                    max = a[i];
                }
            
        }
        //[ 4 , 4 ,2,1,8,3,8]
        int[] count = new int[max + 1];
                                                                                 //  0 1 2 3 4 5 6 7 8 
        for(int i = 0 ;i < a.length ;i++){            //[ 0,0,0,0,0,0,0,0,0]
            count[a[i]]++;                                          //[ 0,1,1,1,2,0,0,0,2]
        }
                                                                                  //  0 1 2 3 4 5 6 7 8 
        for(int i = 1 ;i < count.length ;i++){   //[ 0,1,2,3,5,5,5,5,7]  
            count[i] =  count[i-1]+count[i];
        }
                                                  //  0 1 2 3 4 5 6
        int[] outPut = new int[a.length];         // [0,0,0,0,0,0,0]
        for(int i = a.length - 1 ;i >= 0 ;i--){
            int value = a[i];
            int possition = count[value] - 1;          //[1,2,3,4,4,8,8]
            outPut[possition] = value; 
            count[value]--;
        }
        
        for(int i = 0 ;i < a.length ;i++){
            a[i] = outPut[i];
        }
        
        for(int d : a)
            System.out.print(d +"  ");
           }
}
