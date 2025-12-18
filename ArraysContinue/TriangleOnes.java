// Triangle of Ones

public class TriangleOnes{
    public static void main(String[] args) {
    int rows = 10;
    int[][] t = new int[rows][];

    for(int i = 0; i<rows; i++){
        t[i] = new int[i+1]; // making a new array of size 1+i at 2d array of 1
        t[i][0]= 1;
        t[i][i] = 1;

            for(int j = 1; j<i; j++){
                t[i][j] = 1;
            }
        
        }

        for(int a []: t){
            System.out.println(java.util.Arrays.toString(a));
        }

    }

}