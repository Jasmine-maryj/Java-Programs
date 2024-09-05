import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        // int factAns = fact(number);

        // System.out.println("Fact of a number is " + factAns);

        BigInteger factAns2 = fact2(number);

        System.out.println("Fact of a number is " + factAns2);

        sc.close();
    }

    // method 1
    public static int fact(int number){
        if(number < 0){
            throw new IllegalArgumentException("Please provide positive integers only");
        }

        if( number <= 1){
            return 1;
        }
        int factNumber = number * fact(number - 1);
        return factNumber;
    }

    // method 2
    public static BigInteger fact2(int number){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <=number; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    
    
}
