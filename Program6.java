//import stuff here!

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // Constant for Pi
        final double PI = 3.14159;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Calculate the diameter, area, and circumference
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        // Print the results (without formatting to three decimal places)
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);

        // Close the scanner
        scanner.close();
    }
}


//Paste console output below:
/*


*/
