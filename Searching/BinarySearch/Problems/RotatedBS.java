package Searching.BinarySearch.Problems;

public class RotatedBS {
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 6, 0, 1, 2};
        int target = 4;
        System.out.println("The element found at " + findElement(arr, target));
    }

    public static int findElement(int[] arr, int target){
        int pivot = findPivot(arr);
        if(target == arr[pivot]){
            return pivot;
        }
        int ans = findTarget(arr, target, 0, pivot);
        if(ans != -1){
            return ans;
        }

        return findTarget(arr, target, pivot + 1, arr.length - 1);
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = end + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int findTarget(int[] arr, int target, int start, int end){

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
