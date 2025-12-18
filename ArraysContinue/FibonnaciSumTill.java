
import java.util.Arrays;

public class FibonnaciSumTill{
    static int[] fibSum(int max){
        int[] fib = new int[max*2];
        
        fib[0]=0;
        fib[1]=1;
        int sum = 1;
        int z = 2;
        while (sum <= max) {
            fib[z] = fib[z-1]+fib[z-2];
            sum += fib[z];
            z++;
        }
        
        return Arrays.copyOf(fib, z);
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibSum(20)));
        
    }
}