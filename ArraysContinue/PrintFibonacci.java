
import java.util.Scanner;

public class PrintFibonacci{
    /*
    printing the fibonacci sequence upto the input, and output into the 1darray of numbers
    */

   static int[] fibN(int n){
    // fibonacci has fib[0] = 0 , and fib[1] = 1, else are found by adding, the sequences from 2 to n 
    // ignoring the edgecase

    int[] fib = new int [n];

    fib[0] = 0;
    fib[1] = 1;

    for (int index = 2; index<n; index++){
        fib[index] = fib[index-1] + fib[index-2];
     }


    return fib;
   }

    public static void main(String[]args){java.util.Scanner scan = new Scanner(System.in);

    boolean running = true;   

        try {
                System.out.println("HELLO HOLA NAMASTE! ");
                System.out.println("Loading ............");
                Thread.sleep(2300);
            } catch (Exception e) {
        }

    while (running) {         

        try {
            System.out.println("what should be the length of your fibonacci sequence ?");
            String nString = scan.nextLine();
            int n = Integer.valueOf(nString);
            System.out.println(java.util.Arrays.toString(fibN(n)));

            Thread.sleep(3000);
        } catch (Exception e) {}

        System.out.println("if you are happy, do end the program!, or else redo ");
        String inputEnd = scan.nextLine();
    
        if (inputEnd.equals("redo") || inputEnd.equals("not happy")|| inputEnd.equals("n")|| inputEnd.equals("no") ){
            // implementation
            // loop continues automatically
        }

        if (inputEnd.equals("y") || inputEnd.equals("happy")|| inputEnd.equals("yes")|| inputEnd.equals("done") ){
            System.out.println("Thank You!");
            try{
                Thread.sleep(1000);
                System.out.println(".............End Of Program.............");
            } catch(Exception e){}
            running = false;    
        }        
    }

    scan.close();

    }
}