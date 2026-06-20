/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication66;


public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(filter("ab<c>cb?a")+"");
        System.out.println(reverse(filter("ab<c>cb?a")+"")+"");
        
        
    }
     public static String  filter(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
     
     public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    
}
