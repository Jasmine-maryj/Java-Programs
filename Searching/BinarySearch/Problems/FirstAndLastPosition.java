package Searching.BinarySearch.Problems;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 8, 10};
        int target = 5;

        int[] result = findFirstAndLastPosition(arr, target);
        System.out.println("The positions are " + Arrays.toString(result));
    }

    public static int[] findFirstAndLastPosition(int[] arr, int target){
        int firstPos = findIndex(arr, target, true);
        int secPos = findIndex(arr, target, false);

        return new int[]{firstPos, secPos};
    }


    public static int findIndex(int[] nums, int target, boolean isFirstPos){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                ans =  mid;
                if(isFirstPos){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
