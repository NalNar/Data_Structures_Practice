
public class PascalTriangle{

    public static void pascalTriangle(int rows) {
        // program to output pascal triangle upto rows
        int[][] pTriangle = new int[rows][];        

        for (int i = 0; i<rows; i++){
            // the first and last value is 1
            pTriangle[i] = new int [i+1];
            pTriangle[i][0] = 1;
            pTriangle[i][i] = 1;
            
            for(int j = 1; j<i; j++){
                pTriangle[i][j] = pTriangle[i-1][j-1] + pTriangle[i-1][j]; 
            }




        }

        for(int a[]: pTriangle){
            System.out.println(java.util.Arrays.toString(a));

        }


    }

    public static void main(String[] args) {
    // Write one line of code that replaces the first row with {9, 9, 9}.    
        // System.out.print(Arrays.deepToString(pascalTriangle(10)));
        pascalTriangle(10);



    }
}