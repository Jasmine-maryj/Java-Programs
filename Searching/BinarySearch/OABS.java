package Searching.BinarySearch;

public class OABS {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -4, 2, 20, 23, 56, 60, 70, 89, 90, 100};
        int[] reversedArr = {100, 90, 89, 70, 60, 56, 23, 20, 2, -4, -10, -12};
        int target = -10;
        int targetIndex = findTarget(reversedArr, target);
        System.out.println("The element found at index " + targetIndex + " " + reversedArr[targetIndex]);
    }

    public static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }

            
        }

        return -1;
    }
}
