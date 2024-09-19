package Sorting.Bubblesort;

import java.util.Arrays;

public class OptmizedBS {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        System.out.println("The sorted array is " + Arrays.toString(arr));
        optimizedBubbleSort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));
    }

    public static void optimizedBubbleSort(int[] arr){
        if(arr.length <= 1){
            return;
        }

        boolean swapped;

        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
    

        }

    }
}
