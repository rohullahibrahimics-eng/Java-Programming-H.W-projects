package counting_sort;
public class Counting_sort {
    public static void main(String[] args) {
        int[] input_array={2,1,4,2,3,5,6 };
        int max=input_array[0];
        for (int i = 0; i < input_array.length; i++){
                if(input_array[i]>max){
                        max=input_array[i];
                }
        }
        
        int [] count=new int[max+1];
        for (int i = 0; i < input_array.length; i++) {
            count[input_array[i]]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            count[i]=count[i]+count[i-1];
        }
        
        int[] output=new int[input_array.length];
        for (int i = 0; i < output.length; i++) {
            output[count[ input_array[i]]-1]=input_array[i];
            count[input_array[i]]--;
        }
        
        for (int i = 0; i <output.length; i++) {
            System.out.print(output[i]);
        }
    }
}
