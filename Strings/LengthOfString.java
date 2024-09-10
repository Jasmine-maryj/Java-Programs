package Strings;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(str.length());
        System.out.println(calculateLength(str));
    }

    public static int calculateLength(String str){
        int length = 0;
        // m1 using char Array
        char[] chaArr = str.toCharArray();
        // length = chaArr.length;

        // m2
        StringBuilder sb = new StringBuilder(str);
        // length = sb.lastIndexOf("");
        // length = sb.length();

        // m3
        // length = str.lastIndexOf("");

        // m4
        int count = 0;
        for(char c : str.toCharArray()){
            count++;
        }

        length = count;

        return length;
    }
}
