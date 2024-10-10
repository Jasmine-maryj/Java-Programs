package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(23);
        numbers1.add(89);
        numbers1.add(15);
        numbers1.add(67);
        numbers1.add(42);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(25);
        numbers2.add(33);
        numbers2.add(48);
        numbers2.add(5);

        System.out.println("The meerged arraylist is " + mergeArrayList(numbers1, numbers2));
    }

    public static ArrayList<Integer> mergeArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        // ArrayList<Integer> list = new ArrayList<>();
        
        // for(int ele :list1){
        //     list.add(ele);
        // }
        // for(int ele :list2){
        //     list.add(ele);
        // }

        // method - 2
        // ArrayList<Integer> list = new ArrayList<>(list1);
        // Collections.addAll(list2);

        // method - 3
        ArrayList<Integer> list = new ArrayList<>();
        list1.addAll(list2);

        return list;
    }
}
