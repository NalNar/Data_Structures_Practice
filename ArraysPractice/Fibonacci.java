

public class Fibonacci{
    
    
    

    public static int[] fibonacci20 () {

            int[] a = {1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946};
            return a;

            }
    
    /**
     * checks whether the array is part of the first 20 fibonnaci sequence
     * 
     * @param int[] fibonacciSequence   input array of sequence 
     * @return a boolean                whether it is part of fibonacci
     */

    public static boolean isInFibonacci(int[] fibonacciSequence){

        int[] fib20 = fibonacci20(); // takes in the array from the method into the array reference of fib20
        // now check whether the element in fibonacci sequence exists in the fib20
        for (int elem: fibonacciSequence){
            boolean found = false;
            for (int fibElement : fib20) {
            if (elem == fibElement) {
                found = true;
                break; // Found it! No need to check the rest of the fib20 array.
            }
        }
        
        //  If, after checking all of fib20, the input element was NOT found, 
        //    then the entire sequence cannot be a subset. Return false immediately.
        if (!found) {
            return false;
        }
    }

    //  If the code reaches this point, every element in the input array 
    //    was successfully found in the fibonacci20 array.
    return true;
}



    public static void main(String[] args) {
        boolean f1 = isInFibonacci ( new int [] { 3 , 5 , 9 });
        System.out.println( f1 ); // true
    }
}