package ArrayList;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(89);
        numbers.add(15);
        numbers.add(67);
        numbers.add(42);

        int target = 64;
        System.out.println("The element found at " + findTarget(numbers, target));
    }

    public static int findTarget(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == target){
                return i;
            }
        }
        return -1;
    }
}
