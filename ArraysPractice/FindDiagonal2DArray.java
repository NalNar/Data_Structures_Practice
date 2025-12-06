public class FindDiagonal2DArray{

    /**
     * get the diagonal from the 2d array
     * 
     * @param int[][] array of matrix
     * @return int[] array of diagonal
     * */

    public static int[] getDiagonal(int[][] twoDimensionArray){

        /// implementation behind the get diagonal method is the 
        /// goal is to get array[0][0] [1][1] when row==column
        
        // this would assume the length of the array to size of 2d array, 
        int[] output = new int[twoDimensionArray.length];


        int idx = 0;
        for (int row = 0; row<twoDimensionArray.length; row++) {
        // 1d array = row 0,1,2, if row == row which is
        // 0 0 1 1 2 2 ... 

            output[row] = twoDimensionArray[idx][row]; 
            idx++;

            // if(idx == row){
            //     output[idx] = twoDimensionArray[row][idx]; 
            //     idx++;
            // }

        }
        return output;
    }
    
    public static void main(String[]args){

        // works only for the 2d matrix  
            int [][] m = {
            {1,2,4},
            {4,5,6},
            {7,8,9}
            };
            
            int [] d = getDiagonal (m);
            System.out.println( java.util.Arrays.toString( d )); // returns [1 , 5 , 9
                }
}