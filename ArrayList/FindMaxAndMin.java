package ArrayList;

import java.util.ArrayList;

public class FindMaxAndMin {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(89);
        numbers.add(15);
        numbers.add(67);
        numbers.add(42);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele : numbers){
            if(ele > max){
                max = ele;
            }
            if(ele < min){
                min = ele;
            }
        }

        System.out.println(min + " and " + max);
    }
}
