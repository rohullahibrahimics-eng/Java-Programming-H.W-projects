
package javaapplication50;

import java.util.Scanner;

public class JavaApplication50 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
int[]  a = new int[6];
for(int i = 0 ; i < a.length;i++)
    a[i] = input.nextInt();
    
    
   int max = a[0];    
   for(int i = 0 ;i < a.length ;i++){
       if(a[i] > max)
           max = a[i];
   }
   
   int[] c = new  int[max + 1];
   
   for(int  i = 0 ;i < a.length;i++)
       c[a[i]]++;
   
  for(int i = 1 ;i  < c.length;i++){
      c[i] += c[i-1];
  }
  
  int[] output = new int[a.length];
  
  for(int i = 0 ; i < a.length;i++){
        int value = a[i];
        int position = c[value] - 1;
      output[position] = value;
      c[value]--;
  }
     for(int i = 0 ;i < a.length;i++){
       a[i]= output[i];
   }
  
   for(int i = 0 ;i < a.length;i++){
       System.out.print(output[i]+" ");
   }
    }
}
