package ArrayList;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(0);
        // numbers.add(1);
        // numbers.add(0);
        // numbers.add(3);
        // numbers.add(12);
        // numbers.add(0);
        // numbers.add(5);

        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);
        // numbers.add(5);
        // numbers.add(6);
        // numbers.add(7);

        // numbers.add(0);
        // numbers.add(0);
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);

        numbers.add(5);
        numbers.add(0);
        numbers.add(6);
        numbers.add(0);
        numbers.add(7);
        numbers.add(0);
        numbers.add(8);

        moveZerosToEnd(numbers);
        System.out.println(numbers);
    }

    public static void moveZerosToEnd(ArrayList<Integer> numbers) {
        int start = 0;

        for (int end = 0; end < numbers.size(); end++) {
            if (numbers.get(end) != 0) {
                int temp = numbers.get(start);
                numbers.set(start, numbers.get(end));
                numbers.set(end, temp);
                start++;
            }
        }
    }
}
