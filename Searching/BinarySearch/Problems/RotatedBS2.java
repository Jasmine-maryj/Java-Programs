package Searching.BinarySearch.Problems;

public class RotatedBS2 {
    public static void main(String[] args){
        int[] arr = {2, 9, 2, 2, 2, 2};
        int target = 9;
        System.out.println("The element found at " + findElement(arr, target));
    }

    //incomplete solution
    public static int findElement(int[] arr, int target){
        int pivot = findPivot(arr);
        return -1;
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid + 1]){
                return mid - 1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){

                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }

            if(arr[start] >= arr[mid]){
                end = mid;
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
