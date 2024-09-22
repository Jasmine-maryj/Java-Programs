package Searching;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-12, -10, -4, 2, 20, 23, 56, 60, 70, 89, 90, 100};
        int target = 89;
        int targetIndex = findTarget(arr, target);
        System.out.println("The element found at index " + targetIndex + " " + arr[targetIndex]);
    }

    public static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
