public class LeapYear {

    public static void main(String[] args) {

        boolean checkOne = isLeapYear(1600);
        boolean checkTwo = isLeapYear(2000);
        boolean checkThree = isLeapYear(1700);
        boolean checkFour = isLeapYear(1800);
        System.out.println(checkOne);
        System.out.println(checkTwo);
        System.out.println(checkThree);
        System.out.println(checkFour);
    }

    public static boolean isLeapYear(int year) {
        if (!((year >= 1) && (year <= 9999))) {
            return false;
        }
        else {
            if ((year % 4) == 0) {
                if ((year % 100) == 0) {
                    if ((year % 400) == 0) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }
    }
}
