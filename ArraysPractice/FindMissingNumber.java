import java.util.*;
public class FindMissingNumber{

/**
 * Method to find the missing in the range of array
 */

public static int findMissingNumber(int[]nums){

    int n = nums.length;
    int totalSum = ( (n+1)*(n+2) )/2;
    int actualSum = Arrays.stream(nums).sum();
    return totalSum - actualSum;


}
    public static void main(String[]args){
        int[] a = {1,2,4};
        System.out.println(findMissingNumber(a));
    }



}
