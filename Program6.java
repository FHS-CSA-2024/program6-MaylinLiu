//import stuff here!

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // Constant definition for pi
        final double PI = 3.14159;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        // Calculate diameter, area, and circumference
        double diameter = 2 * radius;
        double area = PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;

        // Format the output to three decimal places
        System.out.print("The Radius of the circle = %.3f%n", radius);
        System.out.print("The Diameter of the circle = %.3f%n", diameter);
        System.out.print("The Area of the circle = %.3f%n", area);
        System.out.print("The Circumference of the circle = %.3f%n", circumference);

        // Close the scanner
        input.close();
    }
}


//Paste console output below:
/*


*/
