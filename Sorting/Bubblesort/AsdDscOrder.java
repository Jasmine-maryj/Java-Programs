package Sorting.Bubblesort;

import java.util.Arrays;

public class AsdDscOrder {
    public static void main(String[] args) {
        int[] arr = { 3, -2, -5, 4, 1, -3 };

        sortArray(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));
    }

    public static void sortArray(int[] arr){
        if(arr.length <= 1){
            return;
        }

        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int negCount = 0, posCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                neg[negCount++] = arr[i];
            }else{
                pos[posCount++] = arr[i];
            }
        }

        pos = Arrays.copyOfRange(pos, 0, posCount);
        neg = Arrays.copyOfRange(neg, 0, negCount);

        sortAscendingOrder(pos);
        sortDescendingOrder(neg);

        for(int i = 0; i < negCount; i++){
            arr[i] = neg[i];
        }
        for(int i = 0; i < posCount; i++){
            arr[negCount + i] = pos[i];
        }

    }

    public static void sortAscendingOrder(int[] arr){
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

    public static void sortDescendingOrder(int[] arr){
        boolean swapped;

        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] > arr[j - 1]){
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
