import java.util.Stack;

public class StackP1{

    public static void main(String[] args) {
    // creating a mini stack of big 3 airlines
        Stack<String> airlines = new Stack<>();
        airlines.push("UNITED AIRLINES");
        airlines.push("DELTA AIRLINES");
        airlines.push("AMERICAN AIRLINES");
        airlines.reversed();
        System.out.println(airlines);
        
        System.out.println(airlines.search("AMERICAN AIRLINES"));
    }

    

}