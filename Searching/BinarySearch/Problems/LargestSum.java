package Searching.BinarySearch.Problems;

public class LargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println("The largest minimum sum is " + findLargestMinSum(arr, m));
    }

    public static int findLargestMinSum(int[] arr, int m){
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = Math.max(start, arr[i]); //max element in the array
            end += arr[i]; //sum of all the ele in the array
        }

        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0;
            int p = 1;

            for(int ele : arr){
                if(sum + ele > mid){
                    sum = ele;
                    p++;
                }else{
                    sum += ele;
                }
            }

            if(p <= m){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}
