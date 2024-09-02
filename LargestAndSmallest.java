import java.math.BigInteger;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {12, 14, 5, 67, 100, 9, 87, -7, -3, -13};
        int[] result = getLargestAndSmallestNumber(arr);
        System.out.println("Largest Number is  " + result[0] + " and smallest is " + result[1]);
    }

    public static int[] getLargestAndSmallestNumber(int[] arr){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] < small){
                small = arr[i];
            }
            if(arr[i] > large){
                large = arr[i];
            }
        }

        return new int[]{large, small};
    }
}
