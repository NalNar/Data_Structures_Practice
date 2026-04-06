import java.util.*;

public class ArrayListPractice1{

    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(
            Arrays.asList(
            new ArrayList<>(Arrays.asList(2, 3, 1)),
            new ArrayList<>(Arrays.asList(0)),
            new ArrayList<>(Arrays.asList(0, 4)),
            new ArrayList<>(Arrays.asList(0)),
            new ArrayList<>(Arrays.asList(2))
        ));
        int index = 0;
        for(; index<al.size(); index++){
            for(int a : al.get(index)){
                System.out.println(a);
            }

        }
    }
}