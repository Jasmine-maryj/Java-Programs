package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(23);
        numbers.add(89);
        numbers.add(15);
        numbers.add(15);
        numbers.add(67);
        numbers.add(42);
        numbers.add(42);

        HashSet<Integer> set = new HashSet<>();
        set.addAll(numbers);

        ArrayList<Integer> results = new ArrayList<>(set);

        // for (Integer num : set) {
        // results.add(num);
        // }

        System.out.println("The result is " + results);

    }
}