package Sorting.Bubblesort;

import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "kiwi", "grape"};

        System.out.println("The sorted array is " + Arrays.toString(arr));
        sortStrings(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));

    }

    public static void sortStrings(String[] strs){
        if(strs.length <= 1){
            return;
        }

        boolean swapped;

        for(int i = 0; i < strs.length; i++){
            swapped = false;
            for(int j = 1; j < strs.length - i; j++){
                if(strs[j].compareTo(strs[j - 1]) < 0){
                    String temp = strs[j];
                    strs[j] = strs[j - 1];
                    strs[j - 1] = temp;
                    swapped = false;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
