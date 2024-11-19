package gfg;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };

        System.out.println("The second largest element is " + getSecondLargest(arr));

    }

    public static int getSecondLargest(int[] arr) {

        // Arrays.sort(arr);

        // int n = arr.length;
        // for(int i = n - 2; i >= 0; i--){
        // if(arr[i] != arr[n - 1]){
        // return arr[i];
        // }
        // }

        // return -1;

        // second appraoch
        int largest = -1;
        int secLargest = -1;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }

        return secLargest;

        // third approach

        // int largest = -1;
        // int secondLargest = -1;

        // for (int i = 0; i <= arr.length - 1; i++) {
        //     if (arr[i] > largest) {
        //         secondLargest = largest;
        //         largest = arr[i];
        //     } else if (arr[i] < largest && arr[i] > secondLargest) {
        //         secondLargest = arr[i];
        //     }
        // }
        // return secondLargest;
    }
}
