package LeetCode.LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;
        System.out.println("The length of the array(before) is " + arr.length);
        int result = removeElement(arr, target);
        System.out.println("The length of the array(after) is " + result);
    }

    public static int removeElement(int[] arr, int target){
        int index = 0;
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] != target){
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
