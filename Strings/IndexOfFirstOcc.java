package Strings;

public class IndexOfFirstOcc {
    public static void main(String[] args) {
        String haystack = "djsdhsad";
        String needle = "sjdk";

        int index = findIndex(haystack, needle);
        System.out.println(index);
    }

    public static int findIndex(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
