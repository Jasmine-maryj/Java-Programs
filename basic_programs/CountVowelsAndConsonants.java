public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Jasmine Mary";

        countVowelsAndConsonants(str);
    }

    public static void countVowelsAndConsonants(String str){
        int vow = 0;
        int cons = 0;

        str = str.toLowerCase();
        char[] cArr = str.toCharArray();

        String vowels = "aeiou";

        for(int i = 0; i < cArr.length; i++){
            Character ch = cArr[i];
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch) != -1){
                    vow++;
                }else{
                    cons++;
                }
            }
        }

        System.out.println("No of vowels: " + vow);
        System.out.println("No of consonants: " + cons);
    }
}
