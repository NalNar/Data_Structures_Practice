/* 3. Print a 10x10 grid of dashes (from W3Resource.com)

Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - - 

*/

public class Dashes{


    public static void main(String[] args) {

        for (int i =0 ; i<10; i++){
            System.out.print("- ");

            for(int j = i; j < (1%2==0); j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    
    }
}