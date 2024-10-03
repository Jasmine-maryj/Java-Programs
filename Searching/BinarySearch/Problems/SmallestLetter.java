package Searching.BinarySearch.Problems;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j'};
        // char[] chars = {'a', 'b'};
        // char target = 'z';
        char target = 'c';
        System.out.println("Smallest letter greater than target is " + smallestLetter(chars, target));
    }

    public static char smallestLetter(char[] chars,  char target){
        int start = 0;
        int end = chars.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(Character.compare(chars[mid], target) > 0){
                end = mid - 1;
            }else if(Character.compare(chars[mid], target) < 0){
                start = mid + 1;
            }
        }

        return chars[start % chars.length];
    }
}
