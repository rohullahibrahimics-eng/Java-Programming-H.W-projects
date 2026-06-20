package chapter8;
public class chapter8_18 {
    public static void main(String [] args)
    {
       int [][] array={{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffl(array);
    }
    
    public static void shuffl(int[][] array)
    {
        int[] random=new int[3];
         random[0]=(int)(Math.random()*array.length);
            random[1]=(int)(Math.random()*array.length);
                random[2]=(int)(Math.random()*array.length);
        for (int i = 0; i < random.length; i++) {
            int[] temp=array[random[i]];
            array[random[i]]=array[i];
            array[i]=temp;
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]+","+array[i][1]+"\n");
        }
    }
}
