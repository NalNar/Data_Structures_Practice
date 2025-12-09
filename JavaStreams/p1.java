public class p1{

    public static void main(String[] args) {
    
    
        // int a = 1;
        java.util.ArrayList<Integer> arli = new java.util.ArrayList<>();
        
        for (int i = 0; i <= 3; i++) {
            arli.add(i);
        }

                int sumInt = arli.stream().mapToInt(Integer::intValue).sum(); // Calculate the sum of elements in IntStream
        
        // System.out.println(arli.stream().mapToInt(Integer::intValue).sum());

        System.out.println( arli.stream().peek(number -> System.out.print(number + " ")).mapToInt(Integer::intValue).sum() );
    }

}