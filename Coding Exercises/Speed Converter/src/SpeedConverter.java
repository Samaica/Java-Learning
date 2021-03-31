public class SpeedConverter {
    public static void main(String[] args) {
    printConversion(1.5);
    toMilesPerHour(1.5);
    printConversion(10.25);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else { //1 mile per hour  = 1.609 kilometers per hour
            double milesPerHour = (kilometersPerHour / 1.609d);
            long roundedMilesPerHour = Math.round(milesPerHour);
            return roundedMilesPerHour;
        }

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
