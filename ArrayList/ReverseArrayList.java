package ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(89);
        numbers.add(15);
        numbers.add(67);
        numbers.add(42);

        System.out.println("The reverse arraylist is " + reverse(numbers));
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        int start = 0;
        int end = list.size() - 1;

        while(start <= end){
            arr.add(list.get(end));
            end--;
        }

        return arr;
    }
}
