public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 12, -3, 2, 5, 100, 80, 90};

        findSecondLargestElement(arr);
    }

    public static void findSecondLargestElement(int[] arr){

        if(arr.length < 2){
            System.out.println("Array muast contain more than 1 elements");
            return;
        }

        int fLarge = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > fLarge){
                sLarge = fLarge;
                fLarge = arr[i];
            }else if(arr[i] > sLarge && arr[i] != fLarge){
                sLarge = arr[i];
            }
        }

        if(sLarge == Integer.MIN_VALUE){
            System.out.println("Ther is not second large element in this array");
        }else{
            System.out.println("The second large element in this array is " + sLarge);
        }
    }
}
