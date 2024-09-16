package Strings;

public class LongestStringPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        System.out.println("The longest string prefix is " + longestStringPrefix(str));
    }

    public static String longestStringPrefix(String[] str){
        if(str.length == 0 || str == null){
            return "";
        }

        String prefix = str[0];

        for(int i = 1; i < str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
}
