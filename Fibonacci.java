import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = sc.nextInt();

        System.out.println("Fibonacci number is " + nthFibonacciNumber2(number));
    }

    public static int nthFibonacciNumber(int number){
        if(number <= 0){
            return 0;
        }
        if(number <= 1){
            return 1;
        }
        int fibo = nthFibonacciNumber(number - 1)+ nthFibonacciNumber(number - 2);
        return fibo;
    }

    public static int nthFibonacciNumber2(int number){
        if(number <= 0) return 0;
        if(number == 1) return 1;

        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= number; i++){
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
