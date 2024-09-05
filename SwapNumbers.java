public class SwapNumbers {
    public static void main(String[] args){
        int[] arr = {10, 20};

        System.out.println("Swapped numbers before " + arr[0] + " and " + arr[1]);
        int[] result = swapNumbers(arr);
        System.out.println("Swapped numbers after " + result[0] + " and " + result[1]);

    }

    public static int[] swapNumbers(int[] nums){
        // m1
        // nums[0] = nums[0] + nums[1];
        // nums[1] = nums[0] - nums[1];
        // nums[0] = nums[0] - nums[1];

        // m2
        // nums[0] = nums[0] * nums[1];
        // nums[1] = nums[0] / nums[1];
        // nums[0] = nums[0] / nums[1];

        // m3
        nums[0] = nums[0] ^ nums[1];
        nums[1] = nums[0] ^ nums[1];
        nums[0] = nums[0] ^ nums[1];


        return new int[]{nums[0], nums[1]};
    }
}
