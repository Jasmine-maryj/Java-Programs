package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(findLengthOfLastWord(str));
    }

    public static int findLengthOfLastWord(String s){
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}
