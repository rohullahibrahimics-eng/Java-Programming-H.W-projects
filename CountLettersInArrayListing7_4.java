
package countlettersinarraylisting7_4;

public class CountLettersInArrayListing7_4 {

    public static void main(String[] args) {
        char[] chars = creatArray();
        System.out.println("The lowerCase Letters are: ");
        displayArray(chars);
        int[] counts = countLetters(chars);
        System.out.println("");
        System.out.println("The occurrence of each Letters are : ");
        displayCounts(counts);
        
    }
    // creat Array with Random Characters!
    public static char[] creatArray(){
        char[] chars = new char[100];
            for (int i = 0 ; i < chars.length; i++){
        chars[i] = getRandomLowerCaseLetter();
        }
        return chars;
    }
    
        public static char getRandomLowerCaseLetter(){
    int randomI =  97 + (int)(Math.random() * 26);
    char randomChar = (char) randomI;
    return randomChar;
    }
   
    public static void displayArray(char[] chars){
        for (int i = 0 ; i < chars.length; i++){
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i] + " ");
            else
                System.out.print(chars[i] + " ");
    }
    }
   
    public static int[] countLetters(char[] chars){
    int[] counts = new int[26];
        for(int i = 0 ; i < chars.length; i++)
            counts[chars[i] - 'a']++;
    return counts;
    }
    
    public static void displayCounts(int[] counts){
        for (int i = 0 ; i < counts.length; i++){
            if ((i + 1) % 10 == 0)
                System.out.println((char) (i + 'a') + " = " + counts[i]);
            else 
                System.out.println((char) (i + 'a') + " = " + counts[i]);
                
                }
    }
    
}
