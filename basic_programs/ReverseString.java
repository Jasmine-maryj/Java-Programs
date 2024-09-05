import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();
        
        String result = reverseString3(str);
        System.out.println("Reversed string is " + result);
    }

    // m 1
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str).reverse();
        return sb.toString();
    }

    //m 2
    public static String reverseString2(String str){
        int end = str.length() - 1;
        String result = "";
        for(int i = end; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    //m 3
    public static String reverseString3(String str){
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while(start <= end){
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(charArr);
        return reversed;
    }


}
