public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {10};

        if(checkIfArraySorted(arr)){
            System.out.println("The array is sorted!");
        }else{
            System.out.println("The array is not sorted!");
        }
    }

    public static boolean checkIfArraySorted(int[] arr){
        if(arr.length <= 1){
            return true;
        }
        int ele = arr[0];
        for(int i = 1; i <= arr.length - 1; i++){
            if(arr[i] > ele){
                ele = arr[i];
            }else{
                return false;
            }
        }

        return true;

    }
}
