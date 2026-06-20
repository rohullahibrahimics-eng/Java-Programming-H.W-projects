
package selectionsort7_11;

public class SelectionSort7_11 {

    public static void main(String[] args){
        double [] myList = {2,9,5,4,8,1,6};
        System.out.println("The array before Seleciton Sort is: ");
        for (int i = 0 ; i < myList.length; i++){
            System.out.println(myList[i]);
        }
        selectionSort(myList);
        System.out.println("The array after Selection Sort is: ");
                for (int i = 0 ; i < myList.length; i++){
            System.out.println(myList[i]);
        }
        
       }
    
    public static void selectionSort(double [] myList){
    for (int i = 0 ; i < myList.length - 1; i++){
    double currentMin = myList[i];
    int currentMinIndex = i;
    
    for (int j = i + 1; j < myList.length; j++){
    if (currentMin > myList[j]){
    currentMin = myList[j];
    currentMinIndex = j;
    }
    }
    
    if (currentMinIndex != i){
    myList[currentMinIndex] = myList[i];
    myList[i] = currentMin;
    }
    }
    }
}
 

