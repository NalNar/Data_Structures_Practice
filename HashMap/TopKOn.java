import java.util.*;

public class TopKOn{
    public static List<Integer>  topKFreq(int [] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        // assuming no exceptions
        for(int n : nums){
            // if the default value exists or + 1
            map.put(n, map.getOrDefault(map, 0)+1);
        }
        TreeMap<Integer, List<Integer> > tree = new TreeMap<>();
        // build the tree
        for (int key : map.keySet()) {
            int freq = map.get(key);
            tree.putIfAbsent(freq, new ArrayList<>());
            tree.get(freq).add(key);
        }

        List<Integer> result = new ArrayList<>();

        for (int freq : tree.descendingKeySet()) {
            for (int num : tree.get(freq)) {
                result.add(num);
                if (result.size() == k) return result;
            }
        }
        return result;



    }

    public static void main(String[]args){
        int a [] = {1,2,3,4,5,6,7,7,8,8,8,31,313,33,7,};
        int k = 6;
        String a = "HI";
        char[]o = a.toCharArray();
        for(char s: o){
            System.out.println(s);
        }
        System.out.println(topKFreq(a,k));

    }
}