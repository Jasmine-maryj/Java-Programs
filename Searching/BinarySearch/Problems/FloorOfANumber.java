package Searching.BinarySearch.Problems;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 6;
        int ans = floorOfANumber(arr, target);
        System.out.println("Floor of a number is " + ans + " i.e, " + arr[ans]);
    }

    public static int floorOfANumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
