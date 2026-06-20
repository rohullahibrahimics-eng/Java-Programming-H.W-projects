package chapter8;

import java.util.Scanner;

public class chapter8_20 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
//        making the table structure
        String[][] table={{"| ","| ","| ","| ","| ","| ","| ","| "},
                                   {"| ","| ","| ","| ","| ","| ","| ","| "},
                                    {"| ","| ","| ","| ","| ","| ","| ","| "},
                                    {"| ","| ","| ","| ","| ","| ","| ","| "},
                                    {"| ","| ","| ","| ","| ","| ","| ","| "},
                                    {"| ","| ","| ","| ","| ","| ","| ","| "}};
//      Display the table
        System.out.println(table.length);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        
//        initializing the row_counter
        int[] row_counter=new int[7];
        for (int i = 0; i < row_counter.length; i++) {
            row_counter[i]=table.length-1;
        }
         
         
         
         
         
//        ------------------------------------------------------------------------------------------------------------
            int counter=1;
        while (counter<100000){
            
            if(counter%2!=0){
                 if(row_checker(table) || column_checker(table) || diagonal_checker(table) || anti_diagonal_checker(table)){
                System.out.println("The yellow player won");
                break;
            }
                 
        System.out.print("Drop a red disk at column (0-6):");
        int red_column=s.nextInt();
        if(table[row_counter[red_column]][red_column].charAt(1)=='R' || table[row_counter[red_column]][red_column].charAt(1)=='Y'){
            row_counter[red_column]--;
        }
         char ch=table[row_counter[red_column]][red_column].charAt(1);
        table[row_counter[red_column]][red_column]= table[row_counter[red_column]][red_column].replace(ch+"", "R");
             
          for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
            if(row_counter[red_column]<1){
                System.out.println("Draw");
            break;
            }
        }
            
            
            
            
            else{
                
                 if(row_checker(table) || column_checker(table) || diagonal_checker(table) || anti_diagonal_checker(table)){
                System.out.println("The red player won");
                break;
            }
                 
                System.out.print("Drop a yellow disk at column (0_6):");
                int yellow_column=s.nextInt();
                if(table[row_counter[yellow_column]][yellow_column].charAt(1)=='R' || table[row_counter[yellow_column]][yellow_column].charAt(1)=='Y' ){   
                    row_counter[yellow_column]--;
                }
                 char ch=table[row_counter[yellow_column]][yellow_column].charAt(1);
                table[row_counter[yellow_column]][yellow_column]=table[row_counter[yellow_column]][yellow_column].replace(ch+"", "Y");
           
                 for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
                        if(row_counter[yellow_column]<1){
                System.out.println("Draw");
            break;
            }
            }
            
               counter++;
    }
        
        
        
        
        
    }
    public static boolean row_checker(String [][] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <table[i].length; j++) {
                if(j<table[i].length-1-4){
                    if(table[i][j].charAt(1)==table[i][j+1].charAt(1) && 
                       table[i][j].charAt(1)==table[i][j+2].charAt(1) &&
                        table[i][j].charAt(1)==table[i][j+3].charAt(1) ){
                        
                        if(table[i][j].charAt(1)!=' '){
                            return true;
                        }
                        
                    }
                }
            }
        }
        return false;
    }
    

    public static boolean column_checker(String [][] table){
        for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j <table.length; j++) {
                if(j<table.length-3){
                    if(table[j][i].charAt(1)==table[j+1][i].charAt(1) && 
                       table[j][i].charAt(1)==table[j+2][i].charAt(1) &&
                        table[j][i].charAt(1)==table[j+3][i].charAt(1) ){
                        
                        if(table[j][i].charAt(1)!=' '){
                            return true;
                        }
                        
                    }
                }
            }
        }
        return false;
    }

    public static boolean diagonal_checker(String [][] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <table[i].length; j++) {
                if(j<table[i].length-1-4  && i<table.length-3){
                    if(table[i][j].charAt(1)==table[i+1][j+1].charAt(1) && 
                       table[i][j].charAt(1)==table[i+2][j+2].charAt(1) &&
                        table[i][j].charAt(1)==table[i+3][j+3].charAt(1) ){
                        
                        if(table[i][j].charAt(1)!=' '){
                            return true;
                        }
                        
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean anti_diagonal_checker(String [][] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = table[i].length-2; j>=0; j--) {
                if(j>=3  && i<table.length-3){
                    if(table[i][j].charAt(1)==table[i+1][j-1].charAt(1) && 
                       table[i][j].charAt(1)==table[i+2][j-2].charAt(1) &&
                        table[i][j].charAt(1)==table[i+3][j-3].charAt(1) ){
                        
                        if(table[i][j].charAt(1)!=' '){
                            return true;
                        }
                        
                    }
                }
            }
        }
        return false;
    }

}