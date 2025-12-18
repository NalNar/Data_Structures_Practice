import java.util.*;
public class RaggedNums{

    /* Print num 2d array rows of numbers.

    */
    public static int[][] raggedNums(int num){
        int[][] array = new int [num][];
        
        int x = 0;
        int y = 1;
        int z = 2;
        for(int i = 0; i<num; i++){
            array [i] = new int[] {x++,y++,z++};


        }
        
        return array;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(Arrays.deepToString(raggedNums(num)));
    }
}