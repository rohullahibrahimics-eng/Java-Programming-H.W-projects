
package searchingarrayslinearandbinary7_10;

public class SearchingArraysLinearAndBinary7_10 {

    public static void main(String[] args) {
        // In this program we will learn the searching arrays and two differrent approaches!
        //this is the linear search!
        int [] myList = {1,3,43,352,2,2,23};
        int n = binarySearch(myList,3);
        System.out.println(n);
       }
    public static void linearSearch(int[] list, int key){
    for (int i = 0; i < list.length; i++){
    if(key == list[i])
        System.out.println("the key number is in list[" +i+ "]");
    }
        System.out.println("The key number is not in this array!");
    }
    public static int binarySearch(int[] list,int key){
    int low = 0;
    int high = list.length-1;
    int mid = (low + high)/2;
    for(int i = 0 ; i < list.length; i++){
    if (key < mid)
        high = mid-1;
    else if (key == mid)
        return mid;
    else if (key > mid)
        low = mid+1;
    }
    return -low -1;
    }
    
}
