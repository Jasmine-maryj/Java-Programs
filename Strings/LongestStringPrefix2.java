package Strings;

public class LongestStringPrefix2 {
    public static void main(String[] args) {
        int[] arr1 = {5655359, 1223};
        int[] arr2 = {56554, 43456};

        System.out.println("The longest string prefix is " + longestStringPrefix(arr1, arr2));
    }

    public static int longestStringPrefix(int[] arr1, int[] arr2){
        int maxLen = 0;

        for(int ele : arr1){
            for(int ele2 : arr2){
                String str1 = String.valueOf(ele);
                String str2 = String.valueOf(ele2);

                int currentLen = getLongestPrefixLength(str1, str2);

                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }

    public static int getLongestPrefixLength(String str1, String str2){
        int length = 0;

        for(int i = 0; i < Math.min(str1.length(), str2.length()); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                length++;
            }else{
                break;
            }
        }
        return length;
    }
}
