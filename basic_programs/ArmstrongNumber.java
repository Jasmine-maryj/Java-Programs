public class ArmstrongNumber {
    public static void main(String[] args){
        int number = 370;
        boolean result = isArmstrongNumber(number);

        if(result){
            System.out.println("The given number is Arstrong Number");
        }else{
            System.out.println("The given number is not an Arstrong Number");
        }
    }

    public static boolean isArmstrongNumber(int number){
        int originalNumber = number;

        // get the count of numbers
        // m1
        int numberOfDigits = Integer.toString(number).length();

        // m2
        // int numberOfDigits = getCount(number);

        int result = 0;

        while(number != 0){
            int lastDigit = number % 10;
            result += (int) Math.pow(lastDigit, numberOfDigits);
            number = number / 10;
        }

        System.out.println("The result after calculation " + result);

        return result == originalNumber;
    }

    public static int getCount(int number){
        if(number == 0){
            return 1;
        }
        return (int) Math.floor(Math.log10(number)) + 1;
    }
}
