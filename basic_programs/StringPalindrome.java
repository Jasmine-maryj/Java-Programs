public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aabcbaa";
        boolean result = checkPalindrome(str);
        if(result){
            System.out.println("The given is palindrome");
        }else{
            System.out.println("The given is not a palindrome");
        }
    }

    public static boolean checkPalindrome(String str){
        char[] cArr = str.toCharArray();
        int start = 0;
        int end = cArr.length - 1;
        while(start <= end){
            if(cArr[start] == cArr[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}
