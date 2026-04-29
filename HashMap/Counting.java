import java.util.*;
public class Counting {

    public static void count(String s){
        // need invidual items from the s
        String input[] = s.split(" ");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(input));
        TreeSet<String> ts = new TreeSet<>(al);
        ArrayList<String> a = new ArrayList<>();

        // now count the frequency
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<input.length; i++){
            String temp = input[i];
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            if(!ts.contains(temp)){
                ts.add(temp);
            }
        }
        // now i have the frequency of the string words
        Collections.sort(al);

        for(String S: ts){
            System.out.println(S + " " + map.get(S));
        }
        
    }

    public static void main(String[] args) {
        // input of the string with count
        String s = "n n n n m m";
        count(s);
    }

}
