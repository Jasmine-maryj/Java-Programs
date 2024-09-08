public class PalindromeNumber {
    public static void main(String[] args){
        int number = 12090921;

        if(isPalindrome(number)){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;
        while(number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return original == reverse;
    }
}
