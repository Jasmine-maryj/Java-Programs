public class PerfectNumber {
    public static void main(String[] args) {
        int number = 20;

        boolean isPerfectNumber = isPerfectNumber(number);

        if(isPerfectNumber){
            System.out.println("The given number is a perfect number");
        }else{
            System.out.println("The given number is not a perfect number");
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number <= 1) {
            return false;
        }

        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

       return sum == number;
    }
}
