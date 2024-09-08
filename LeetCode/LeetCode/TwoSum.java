package LeetCode.LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 5;
        int[] twoSumIndex = calculateTwoSum(arr, target);
        if(twoSumIndex.length > 0){
            System.out.println("Found at " + twoSumIndex[0] + " and " + twoSumIndex[1]);
        }else{
            System.out.println("Not found");
        }
    }

    public static int[] calculateTwoSum(int[] arr, int target){
        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
