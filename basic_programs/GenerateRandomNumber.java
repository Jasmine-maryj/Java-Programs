import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        int randomNumber = generateRandomNumber2(1, 10);
        System.out.println("Generated random number is " + randomNumber);
    }

    public static int generateRandomNumber1(int min, int max){
        return (int) (Math.random() * (max - min) + 1) + min;
    }

    public static int generateRandomNumber2(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
