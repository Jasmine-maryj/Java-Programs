package Searching.BinarySearch.Problems;

public class PeakElement2 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1};
        int target = 4;
        System.out.println("The peak element is at index " + findElement(arr, target));
    }

    public static int findElement(int[] arr, int target){
        int peakElement = findPeakElement(arr);
        int searchFirst = OAbinarySearch(arr, target, 0, peakElement);
        if(searchFirst == -1){
            return searchFirst;
        }
        return OAbinarySearch(arr, target, peakElement + 1, arr.length - 1);
    }

    public static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }

    public static int OAbinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
