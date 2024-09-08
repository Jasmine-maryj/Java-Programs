public class BinaryToDecimal {
    public static void main(String[] args){
        String str = "101010";

        int decimalNumber = convertBinaryToDecimal(str);
        System.out.println("The decimal number is " + decimalNumber);
    }

    public static int convertBinaryToDecimal(String str){
        int decimal = 0;
        for(int i = 0; i <= str.length() - 1; i++){
            if(str.charAt(str.length() - 1 - i) == '1'){
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
