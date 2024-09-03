import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the operation you want to perform(+, -, *, /, %): ");
        String op = sc.next();
        
        System.out.println("Enter two values(int): ");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        calculate(val1, val2, op);
        
    }

    public static void calculate(int val1, int val2, String op){
        int result = 0;
        switch (op) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                if(val2 == 0){
                    System.out.println("value2 cannot be zero");
                    return;
                }
                result = val1 / val2;
                break;
            case "%":
                result = val1 % val2;
                break;
            default:
                break;
        }

        System.out.println("The result " + result);


    }
}
