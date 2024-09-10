package LeetCode.LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        int number = -123;

        int result = reverseInteger(number);

        System.out.println("The reveresed number is " + result);
    }
    
    public static int reverseInteger(int number){
        int reverse = 0;
        
        
        while(number != 0){
            System.out.println("The reveresed number is ");
            int lastDigit = number % 10;

            if(reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)){
                return 0;
            }

            if(reverse > Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)){
                return 0;
            }

            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        if(number < 0){
            return reverse * -1;
        }else{
            return reverse;
        }
    }
}
