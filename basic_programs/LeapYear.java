public class LeapYear {
    public static void main(String[] args){
        int year = 2025;

        boolean isLeapYear = checkLeapYear(year);

        if(isLeapYear){
            System.out.println("The given " + year + " is a leap year");
        }else{
            System.out.println("The given " + year + " is not a leap year");
        }
    }

    public static boolean checkLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
