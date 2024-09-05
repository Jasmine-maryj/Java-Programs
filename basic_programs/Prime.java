import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        boolean result = checkPrimeNumber(number);
        if(result){
            System.out.print("Prime Number");
        }else{
            System.out.print("Not a Prime Number");
        }
    }

    public static boolean checkPrimeNumber(int number){
        int i = 2;
        while(i < Math.sqrt(number)){
            if(number % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }
    
}
