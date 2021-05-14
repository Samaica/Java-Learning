public class DecimalComparator {
    public static void main(String[] args) {
    areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("true : " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("false : " + areEqualByThreeDecimalPlaces(-3.1756, -3.177));
        System.out.println("true : " + areEqualByThreeDecimalPlaces(-3.0, -3.0));

        
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        double check_firstNum = firstNum * 1000;
        double check_secondNum = secondNum * 1000;

        if ((int) check_firstNum == (int) check_secondNum) {
            return true;
        }else {
            return false;
        }
    }
}
