package Sorting.Bubblesort;

import java.util.Arrays;

public class CheckIfArrayIsAlreadySorted {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] arr = {3, 1, 5, 4, 2};
        int[] arr = {3, -2, -5, 4, 1, -3};

        checkIfArrayAlreadySorted(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void checkIfArrayAlreadySorted(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        boolean swapped;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    count++;
                }
            }

            if (!swapped) {
                System.out.println("Already sorted, no further passes needed.");
                break;
            }
        }
        System.out.println("Number of comparisions made is " + count);

    }
}
