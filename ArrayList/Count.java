package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);

        HashMap<Integer, Integer> map = countNumbers(numbers);

        for (Map.Entry<Integer, Integer> time : map.entrySet()) {
            System.out.println(time.getKey() + " occurs " + time.getValue() + " times");
        }

    }

    public static HashMap<Integer, Integer> countNumbers(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : numbers) {
            // if(map.containsKey(ele)){
            // map.put(ele, map.get(ele) + 1);
            // }else{
            // map.put(ele, 1);
            // }

            map.put(ele, map.getOrDefault(ele, 0) + 1);

        }

        return map;
    }
}
