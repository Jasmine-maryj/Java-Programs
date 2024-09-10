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

         int[] indexS = new int[200]; 
         int[] indexT = new int[200]; 
         
         int len = s.length();
         
         if(len != t.length()) {
             return false;
         }
         
         for(int i = 0; i < len; i++) {
             if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                 return false; 
             }
             
             indexS[s.charAt(i)] = i + 1; 
             indexT[t.charAt(i)] = i + 1; 
         }
         
         return true;
    }
}
