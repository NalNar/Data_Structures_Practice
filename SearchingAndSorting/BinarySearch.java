public class BinarySearch{
    public static int binarySearch(int[] array, int key){
        // what i need in binary search 
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(array[mid] > key){
                // leave right
                low = mid+1;
            } else if (array[mid] < key){
                // leave left
                high = mid-1;
            } else {
                // found it
                return mid;
            }

        }
        return -1;
    }

    public static int binarySearchRec(int[] array, int k, int l, int h){
        if(l > h){
            return -1;
        }
        
        int mid = (l + h) / 2;
        if(k < array[mid]){
            return binarySearchRec(array, k, l, mid-1);
        }
        else if( k > array[mid]){
            return binarySearchRec(array, k, mid+1,h);
        } else {
            return mid;
        }
    }

    public static void main(String[]args){
        int[] ar = {1,2,3,4,5};
        int a = 3;
        System.out.println(binarySearchRec(ar, a, 0, ar.length-1));
    }
}