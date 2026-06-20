package chapter_10;
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        
        System.out.println(isPalindrom("ab<c>cb?a"));
        
    }
    public static boolean isPalindrom(String s){
        String s1=filter(s);
                String s2=reverse(s1);
                
                return s1.equals(s2);
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
