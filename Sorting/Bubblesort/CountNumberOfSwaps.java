package Sorting.Bubblesort;

public class CountNumberOfSwaps {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("number of swaps " + countNoOfSwaps(arr));
    }

    public static int countNoOfSwaps(int[] arr){
        int count = 0;

        if(arr.length <= 1){
            return 0;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count += 1;
                }
            }
        }

        return count;
    }
}
