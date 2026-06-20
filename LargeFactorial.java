/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_10;

import java.math.BigInteger;

public class LargeFactorial {
    public LargeFactorial(int n){
        BigInteger bi=new BigInteger(n+"");
        for (int i=1; i<=n;i++){
            bi=bi.multiply(new BigInteger(i+""));
        }
        System.out.println(bi);
    }
}
