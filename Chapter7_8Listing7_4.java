
package array;

public class Chapter7_8Listing7_4 {

    public static void main(String[] args) {
        char[] chars = creatArray();
        for (int i = 0 ; i < chars.length; i++){
            System.out.println(chars[i]);
        }
    }
    
    public static char[] creatArray(){
    char[] chars = new char[100];
    for (int i = 0 ; i < chars.length; i++){
    chars[i] = RandomCharacter.getRandomLowerCaseLetter();
    }
    return chars;
    }
    
}
