import java.util.ArrayList;
import java.util.Arrays;

public class NthPrimeNumber {
    public static void main(String[] args) {
        int n = 50;

        System.out.println(Arrays.toString(printPrimeNumbers(n)));
    }

    public static int[] printPrimeNumbers(int n){
        if(n <= 1){
            return new int[]{};
        }
        if(n == 2){
            return new int[]{2};
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2; i <= n; i++){

             if(isPrimeNumber(i)){
                list.add(i);
             }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }


        return result;
    }

    public static boolean isPrimeNumber(int number){
        if(number < 2){
            return false;
        }

        int i = 2;

        while(i <= Math.sqrt(number)){
            if(number % i == 0){
                return false;
            }
            i++;
        }

        return true;
    }
}
