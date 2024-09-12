package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama";
        // String str = "race a car";
        String str = "0P";

        boolean isValid = checkValidPalindrome(str);
        if(isValid){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
    }

    public static boolean checkValidPalindrome(String str){
        if(str.length() <= 0){
            return true;
        }

        str = str.toLowerCase();
        System.out.println(str);
        String s = str.replaceAll("[^a-z0-9]", "");
        System.out.println(s);

        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) == (s.charAt(end))){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}
