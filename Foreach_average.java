/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreach_average;

import java.util.Scanner;

/**
 *
 * @author Mohammad Asif
 */
public class Foreach_average {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter 10  numbers:");
        int [] numbers= new int[10];
        int sum=0;
        for(int x:numbers){
            x=s.nextInt();
            sum=sum+x;
        }
        
        double average=sum/numbers.length;
        int upper=0;
        int down=0;
        for(int h=0;h<numbers.length;h++){
            if(numbers[h]>=average){
            upper++;
            }
            if(numbers[h]<average){
            down++;
            }
        }
        System.out.println("The average is "+average);
        System.out.println("The unumbers which are above the average is  "+upper);
        System.out.println("The numbera which are down than average is"+ down);
    }
   
    
}
