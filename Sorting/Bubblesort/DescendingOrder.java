package Sorting.Bubblesort;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 7, 4};

        System.out.println("The array before sorting is " + Arrays.toString(arr));
        descendingOrderSort(arr);
        System.out.println("The array after sorting is " + Arrays.toString(arr));
    }

    public static void descendingOrderSort(int[] arr){
        if(arr.length <= 1){
            return;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
