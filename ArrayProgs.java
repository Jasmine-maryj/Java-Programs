public class ArrayProgs {
    public static void main(String[] args) {
        int[] arr = { 10, 4, -3, 56, 89, 23 };

        int sum = getSum(arr);
        double avg = getAvg(arr);
        int[] maxMin = getMaxMin(arr);
        int[] SumOfOddNEven = getSumOfOddNEven(arr);
        int smallestNumber = getSmallestNumber(arr);

        System.out.println("The sum of digits in the array is " + sum);
        System.out.println("The avg is " + avg);
        System.out.println("The Max and Min values are " + maxMin[0] + " and " + maxMin[1]);
        System.out.println("The Sum of Even and Odd numbers are " + SumOfOddNEven[0] + " and " + SumOfOddNEven[1]);
        System.out.println("The smallest number is " + smallestNumber);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return (sum / arr.length);
    }

    public static int[] getMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[] { max, min };
    }

    public static int[] getSumOfOddNEven(int[] arr) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOfOdd += arr[i];
            }
        }
        return new int[] { sumOfEven, sumOfOdd };
    }

    public static int getSmallestNumber(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

}
