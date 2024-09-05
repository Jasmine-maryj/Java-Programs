import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {23, 213, 343, 454, 10, 123};

        System.out.println("The reversed array is " + Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            System.out.println("inside the loop");

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(arr);
        return arr;
    }
}
