package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Learn{
    public static void main(String[] args){
        String str = "HelLo World";

        char ch = 'd';

        int result = countCharacterCount(str, ch);

        System.out.println("Count: " + result);

        // HashMap<Character, Integer> charOcc = new HashMap<>();

        // for(int i = 0; i <= str.length() - 1; i++){
        //     charOcc.put(str.charAt(i), i);
        // }

        // for(int i = 0; i <= str.length() - 1; i++){
        //     System.out.println(charOcc.get(str.charAt(i)));
        // }

        // System.out.println(charOcc.entrySet());

        // System.out.println(charOcc.keySet());
        // System.out.println(charOcc.values());
        // charOcc.remove(' ');
        // System.out.println(charOcc.keySet());
        // System.out.println(charOcc.values());

        // HashMap<Character, Integer> charOcc = getCharacterOccurences(str);

        // System.out.println(charOcc.entrySet());

        // for(Map.Entry<Character, Integer> entry: charOcc.entrySet()){
        //     System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        // }

    }

    public static int countCharacterCount(String str, Character ch){
        int count = 0;
        for(int i = 0; i <= str.length() - 1; i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    public static HashMap<Character, Integer> getCharacterOccurences(String str){
        HashMap<Character, Integer> charOcc = new HashMap<>();

        for(int i = 0; i <= str.length() - 1; i++){
            if(charOcc.containsKey(str.charAt(i))){
                charOcc.put(str.charAt(i), charOcc.get(str.charAt(i)) + 1);
            }else{
                charOcc.put(str.charAt(i), 1);
            }
        }

        return charOcc;
    }
}