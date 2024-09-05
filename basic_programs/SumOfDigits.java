import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum = 0;

        //method 1
        // while(number != 0){
        //     sum += number % 10;
        //     number = number / 10;
        // }

        //method - 2
        sum = (number / 100) + (((number) / 10) % 10) + (number % 10);

        System.out.println("The sum is " + sum);

        sc.close();
    }
    
}
