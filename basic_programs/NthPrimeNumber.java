import java.util.Arrays;

public class NthPrimeNumber {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Arrays.toString(printPrimeNumbers(n)));
    }

    public static int[] printPrimeNumbers(int n){
        if(n == 0){
            return new int[]{};
        }
        if(n == 1){
            return new int[]{1};
        }

        int[] result = {2};

        for(int i = 2; i <= 10; i++){

             while(i <= Math.sqrt(i)){
                if(i % 2 == 0){
                    result.push()
                }
             }
        }


        return result;
    }
}
