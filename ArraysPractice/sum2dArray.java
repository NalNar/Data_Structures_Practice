/*Add two same-size matrices
Write a Java program to add two matrices of the same size.
*/

public class sum2dArray{

        /// idea is to get two array and sum the total first then do the second

        public static int getSum2DArray (int [][] arr){
            // using for each to extract out the value
            int total = 0 ;

            for(int Arr1D[] : arr){
                for(int elem : Arr1D){
                    total += elem;
                }
            }

            return total;
        }
}
