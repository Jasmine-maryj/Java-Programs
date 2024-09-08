package HashMap;

import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "Listen iwue   ";
        String str2 = "     Silent";

        if(isAnagram(str1, str2)){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("The strings are not anagrams");
        }
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        HashMap<Character, Integer> charMap = new HashMap<>();

        for(char c : str1.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for(char c : str2.toCharArray()){
            if(!charMap.containsKey(c) || charMap.get(c) == 0){
                return false;
            }
            charMap.put(c, charMap.get(c) - 1);
        }

        return true;
    }
}
