import java.util.*;
public class FindDuplicate{
    
    public static boolean hasDuplicate(int[] nums) {
        // creating a hash set for the nums
        Set<Integer> numSet = new HashSet<>();

            /// adding the number to set, auto remove duplicates
        for (int number: nums) {
            numSet.add(number);
        }
        // recall the hash set removes duplicates, so checking the length would be enough
        return numSet.size() != nums.length;
    }


    public static void main(String[]args){
        int []a = {1,2,3,4,5,5};
        System.out.println(hasDuplicate(a));

    }
}

