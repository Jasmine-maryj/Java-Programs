package LeetCode.LeetCode;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";

        boolean isIsomorphic = isIsomorphic(s1, s2);

        if (isIsomorphic) {
            System.out.println("The strings are isomorphic");
        } else {
            System.out.println("The strings are not isomorphic");
        }
    }

    public static boolean isIsomorphic(String s, String t) {
        // if (s1.length() != s2.length()) {
        //     return false;
        // }

        // HashMap<Character, Character> charS1Map = new HashMap<>();
        // HashMap<Character, Character> charS2Map = new HashMap<>();

        // for (int i = 0; i <= s1.length() - 1; i++) {
        //     char c1 = s1.charAt(i);
        //     char c2 = s2.charAt(i);

        //     // two character should not map to the same character
        //     if (charS1Map.containsKey(c1)) {
        //         if (charS1Map.get(c1) != c2) {
        //             return false;
        //         }
        //     } else {
        //         charS1Map.put(c1, c2);
        //     }

        //     if (charS2Map.containsKey(c2)) {
        //         if (charS2Map.get(c2) != c1) {
        //             return false;
        //         }
        //     } else {
        //         charS1Map.put(c2, c1);
        //     }
        // }

        // return true;


         // Create arrays to store the index of characters in both strings
         int[] indexS = new int[200]; // Stores index of characters in string s
         int[] indexT = new int[200]; // Stores index of characters in string t
         
         // Get the length of both strings
         int len = s.length();
         
         // If the lengths of the two strings are different, they can't be isomorphic
         if(len != t.length()) {
             return false;
         }
         
         // Iterate through each character of the strings
         for(int i = 0; i < len; i++) {
             // Check if the index of the current character in string s
             // is different from the index of the corresponding character in string t
             if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                 return false; // If different, strings are not isomorphic
             }
             
             // Update the indices of characters in both strings
             indexS[s.charAt(i)] = i + 1; // updating index of current character
             indexT[t.charAt(i)] = i + 1; // updating index of current character
         }
         
         // If the loop completes without returning false, strings are isomorphic
         return true;
    }
}
