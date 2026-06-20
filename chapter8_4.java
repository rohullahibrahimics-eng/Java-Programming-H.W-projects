package chapter8;

import java.util.Scanner;

public class chapter8_4 {
    public static void main(String[] args) {
    int[][] employee={{2,4,3,4,5,8,8},
                                 {7,3,4,3,3,4,4},
                                 {3,3,4,3,3,2,2},
                                 {9,3,4,7,3,4,1},
                                 {3,5,4,3,6,3,8},
                                 {3,4,4,6,34,4},
                                 {3,7,4,8,3,8,4},
                                 {6,3,5,9,2,7,9}};
    
    int[] sum=new int[employee.length];
        for (int i = 0; i < employee.length; i++) {
            int suming=0;
            for (int j = 0; j < employee[i].length; j++) {
                suming+=employee[i][j];
            }
            sum[i]=suming;
            System.out.println("Employee "+i+" worked "+sum[i]+" hours totlay in this week");
        }   
        System.out.println();
        
        int[] index_new_sort=new int[employee.length];
        for (int i = 0; i < employee.length; i++) {
            index_new_sort[i]=i;
        }
        
        for (int i = 0; i < sum.length; i++) {
            for (int j = i+1; j <(sum.length); j++) {
                if(sum[i]<sum[j]){
                int temp=sum[i];
                sum[i]=sum[j];
                sum[j]=temp;
//                sorting the index of array
                int tempo=index_new_sort[i];
                index_new_sort[i]=index_new_sort[j];
                index_new_sort[j]=tempo;
                }
            }
            System.out.println("Employee "+index_new_sort[i]+" worked "+sum[i]+" hours totlay in this week");
        }
    }
}
