import java.util.ArrayList;

public class FibonacciSum {

    public static ArrayList<Integer> fibSum(int max) {
        ArrayList<Integer> fib = new ArrayList<>();

        fib.add(0);
        fib.add(1);

        int sum = 1; // 0 + 1

        while (true) {
            int next = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);

            if (sum + next > max) {
                break;
            }

            fib.add(next);
            sum += next;
        }

        return fib;
    }

    public static void main(String[] args) {
        System.out.println(fibSum(10));
    }
}
