public class PalindromeStringArray {
    public static void main(String[] args) {
        String[] arr = {"Jasmine", "JOhn", "Mary", "Jasmine"};

        boolean result = checkArrayPalindrome(arr);
        if(result){
            System.out.println("It is a palindrome array");
        }else{
            System.out.println("It is not a palindrome array");
        }
    }

    public static boolean checkArrayPalindrome(String[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            if(arr[start].equals(arr[end])){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}
