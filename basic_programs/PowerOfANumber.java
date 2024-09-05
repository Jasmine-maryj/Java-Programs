import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lets consider base number is 2

        System.out.println("Enter the power");
        int power = sc.nextInt();
        double result = calculatePower(power);
        System.out.println("The result is " + result);
    }

    public static double calculatePower(int power){
        double ans = 0;
        double base = 2;
        if(power == 0){
            ans = 1;
        } else if(power < 0){
            ans = 1.0;
            for(int i = 1; i <= -power; i++){
                ans *= base;
            }
            // ans = (1.0 / ans);
            if(power % 2 != 0){
                ans = -ans;
            }

        } else if (power > 0){
            ans = 1.0;
           for(int i = 1; i <= power; i++){
               ans *= base;
           } 
        }

        return ans;
    }
}
