package chapter8;

import java.util.Arrays;

public class chapter8_30 {
        public static void main(String[] args){
            String output="";
            String[] str={"flower","flow" , "flight" };
            int smallest_length=100000;
        for(int j=0; j<str.length; j++){
            if(smallest_length > str[j].length()){
                smallest_length=str[j].length();
            }
        }

            int counter_prefix=0;
        for(int i=0; i< smallest_length ; i++){
            counter_prefix=1;
           for(int k=0; k < str.length-1 ; k++){
            if(str[k].charAt(i)==str[k+1].charAt(i)){
                counter_prefix++;
            }
        }
           if(counter_prefix>=str.length){
               output=output+str[0].charAt(i);
           }
    }
            System.out.println(output);
    }
}
