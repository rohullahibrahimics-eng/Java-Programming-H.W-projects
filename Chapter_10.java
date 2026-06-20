package chapter_10;
public class Chapter_10 {
    public static void main(String[] args) {
//        LargeFactorial lf=new LargeFactorial(50);

  char[] array={'a','h','m','a','d'};
//  array.toString();
       StringBuilder strB=new StringBuilder("welcom to java");
        System.out.println(strB);
        strB.setLength(40);
        System.out.println(strB.length());
        System.out.println(strB.capacity());
        System.out.println(strB.toString());
        System.out.println(strB.charAt(2));
    }
    
}
