import java.util.Scanner;

public class LinearSearch {

    // CLI Visualization for Linear Search
    public static void linearSearch(int[] array, int target) {

        // inducing a dramatic entry for the text
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
        }

        System.out.println("\n================= LINEAR SEARCH VISUALIZER =================");
        // inducing a dramatic entry for the text
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
        }
        System.out.print("Array: [ ");
        for (int n : array) System.out.print(n + " ");
        System.out.println("]\nTarget: " + target);
        System.out.println("------------------------------------------------------------\n");

        int index = 0;

        while (true) {

            // Pretty step-by-step print
            System.out.println("Checking index " + index + " → value = " + array[index]);

            if (array[index] == target) {
                try {
                    System.out.println("I think we are on to something!");
                    System.out.println("Loading............");
                    Thread.sleep(4000);
                    System.out.println("Printing............");
                    Thread.sleep(400);
                } catch (InterruptedException ex) {
                }
                System.out.println("\n✨ FOUND! '" + target + "' is at index " + index + " ✨");
                System.out.println("============================================================");
                break;
            } else {
                System.out.println("❌ Not a match, moving to next...\n");
                // inducing sleep for added visual element
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                }
            }

            index++;
            if (index >= array.length) {
                System.out.println("❗ Target not found in the array.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // test array 
        int[] inputArray = {5, 12, 19, 21, 33, 47, 58, 63, 71, 88, 94, 102, 150, 202, 250};

        System.out.println("Enter your target number to search:");
        int inputTarget = scan.nextInt();

        linearSearch(inputArray, inputTarget);
        
        scan.close();
    }
}
