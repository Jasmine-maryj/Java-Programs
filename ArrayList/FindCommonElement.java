package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommonElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(23);
        numbers1.add(48);
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
        numbers2.add(15);

        ArrayList<Integer> common = findCommonElements(numbers1, numbers2);
        System.out.println("Common elements: " + common);
    }

    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(list1);

        for (int ele : set) {
            if (list2.contains(ele)) {
                commonElements.add(ele);
            }
        }

        return commonElements;
    }
}
