import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double val;
        String unit = "";

        double convertedVal = 0.0;
        String convertedUnit = "";

        //used for limiting the double output to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("======Converter Program======\n");

        //inputting values
        System.out.print("Enter the value to convert: ");
        val = sc.nextDouble();
        System.out.print("Enter the current unit of measurement: ");
        unit = sc.next();

        //checking and converting values according to unit inputted and printing
        //Invalid input if inputted unit is not available
        switch (unit) {
            case "km":
                convertedVal = val * 0.62;
                convertedUnit = "mi";
                break;
            case "mi":
                convertedVal = val * 1.61;
                convertedUnit = "km";
                break;
            case "cm":
                convertedVal = val * 0.39;
                convertedUnit = "in";
                break;
            case "in":
                convertedVal = val * 2.52;
                convertedUnit = "cm";
                break;
            case "kg":
                convertedVal = val * 2.2;
                convertedUnit = "lb";
                break;
            case "lb":
                convertedVal = val * 0.45;
                convertedUnit = "kg";
                break;
            default:
                System.out.println("Invalid unit");
        }

        //since the length of string will 0 if inputted unit is invalid. So, this line won't be printed
        //if invalid unit is given by user.
        if (convertedUnit.length() != 0)
            System.out.println("" + df.format(val) + unit + " is equal to " + df.format(convertedVal) + convertedUnit);
    }
}
