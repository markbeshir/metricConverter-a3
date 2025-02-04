import java.util.Scanner;

public class metricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Display welcome message and instructions
        System.out.println("Welcome to metric converter!");
        System.out.println("Please input a conversion query. For example, '1 kg = lb'");
        System.out.println("Supported conversions:");
        System.out.println("- kilograms (kg) to pounds (lb)");
        System.out.println("- grams (g) to ounces (oz)");
        System.out.println("- kilometers (km) to miles (mi)");
        System.out.println("- millimeters (mm) to inches (in)");
        System.out.println("Enter 'exit' or '-1' to exit the program");

        while (true) {
            System.out.print("\nEnter a conversion query: ");
            input = scanner.nextLine().toLowerCase().trim();

            // Check for exit condition
            if (input.equals("exit") || input.equals("-1")) {
                System.out.println("Thank you for using metric converter. Goodbye!");
                break;
            }

            // Process the input
            processConversion(input);
        }

        scanner.close();
    }

    private static void processConversion(String input) {
        try {
            // Split the input into parts
            String[] parts = input.split("\\s+");

            // Check if input format is correct (should be like "1 km = mi")
            if (parts.length != 4 || !parts[2].equals("=")) {
                throw new IllegalArgumentException();
            }

            // Extract value and units
            double value = Double.parseDouble(parts[0]);
            String fromUnit = parts[1];
            String toUnit = parts[3];

            // Perform conversion
            double result = convert(value, fromUnit, toUnit);
            
            // Print result
            System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, result, toUnit);

        } catch (Exception e) {
            System.out.println("Your input is not currently handled by this app, please input another conversion query, for example, '1 kg = lb'");
        }
    }

    private static double convert(double value, String fromUnit, String toUnit) {
        switch (fromUnit + "_" + toUnit) {
            // Weight conversions
            case "kg_lb":
                return value * 2.20462;
            case "g_oz":
                return value * 0.035274;

            // Distance conversions
            case "km_mi":
                return value * 0.621371;
            case "mm_in":
                return value * 0.0393701;

            default:
                throw new IllegalArgumentException("Unsupported conversion");
        }
    }
}
