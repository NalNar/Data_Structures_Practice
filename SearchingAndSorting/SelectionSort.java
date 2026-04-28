import java.util.*;

public class SelectionSort{

    /**
     * selection sorts an array
     * @param array
     * @return sorted array
     */

    public static void selectionSort(int[] array){
        // selection sort is the algo to 
        // recursively finds the smallest and 
        // putting it in the unsorted array's index
        for(int i = 0; i<array.length; i++){
            int currentMin = array[i];
            int currentMinIndex = i;

            for(int j = i+1; j<array.length; j++){
                if(currentMin > array[j]){
                    // swap
                    currentMin = array[j];
                    currentMinIndex = j;

                }
            }
            if(currentMinIndex != i){
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }


    }

    /**
     * 
     * @param array
     * @return sorted array 
     */
    public static void selectionSortRecursive(int[] array, int start){
        if(start >= array.length-1){
            return ; // the array is sorted
        }
        // finding index for the smallest array
        int minIndex = start;
        for(int i = start+1; i<array.length; i++){
            if(array[minIndex] > array[i]){
                // swap index
                minIndex = i;
            }
        }
        
        // swap at the start, min Index
        int temp = array[start];
        array[start] = array[minIndex];
        array[minIndex] = temp;

        selectionSortRecursive(array,start+1);
    }


    public static void main(String[] args) {
        int[] a = {1,32,43,2,1,5};
        selectionSortRecursive(a,0);
        
        System.out.print(Arrays.toString(a));
    }
}