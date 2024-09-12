package Strings;

public class ZigZagCoversation {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        // int rows = 3;
        // int rows = 4;
        int rows = 1;

        System.out.println(convert(str, rows));
    }

    public static String convert(String str, int rows){
        if(rows == 1 || rows > str.length()){
            return str;
        }

        // creating String Builder array
        StringBuilder[] r = new StringBuilder[rows];

        // initializing each with an empty string
        for(int i = 0; i < rows; i++){
            r[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for(char c : str.toCharArray()){
            r[currentRow].append(c);

            if(currentRow == 0 || currentRow == rows - 1){
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder row : r){
            sb.append(row);
        }

        return sb.toString();
    }
}
