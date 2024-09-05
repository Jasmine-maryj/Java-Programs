public class CountDigits {
    public static void main(String[] args) {
        // int number = 987868;
        long number = 1023;

        System.out.println("The number of digits in the number is " + getCount(number));
    }

    public static int getCount(long number){

        System.out.println(number);

        if(number == 0){
            return 1;
        }
        // m 1
        int count = 0;
        while (number != 0){
            long lastDigit = number % 10;
            number /= 10;
            count++;
        }

        System.out.println("The count is " + count);

        return count;
    }
}
