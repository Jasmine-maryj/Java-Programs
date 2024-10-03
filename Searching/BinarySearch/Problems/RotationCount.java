package Searching.BinarySearch.Problems;

public class RotationCount {
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 6, 0, 1, 2};
        System.out.println("The rotation count is " + getRotationCount(arr));
    }

    public static int getRotationCount(int[] arr){
        return getPivot(arr) + 1;
    }

    public static int getPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] >= arr[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
