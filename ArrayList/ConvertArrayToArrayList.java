package ArrayList;

import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        Integer[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        String[] arr2 = { "apple", "banana", "cherry" };
        System.out.println(convertToArrayList(arr));
        System.out.println(convertToArrayListGenericType(arr1));
        System.out.println(convertToArrayListGenericType(arr2));
    }

    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int ele : arr) {
            list.add(ele);
        }

        return list;
    }

    // generic type
    public static <T> ArrayList<T> convertToArrayListGenericType(T[] arr) {
        ArrayList<T> list = new ArrayList<>();

        for (T ele : arr) {
            list.add(ele);
        }

        return list;
    }
}
