import java.util.Scanner;

public class areaandperimeter{

    static double squareArea(double side) {
        return side * side;
    }

    static double squarePerimeter(double side) {
        return 4 * side;
    }

    static double rectangleArea(double length, double width) {
        return length * width;
    }

    static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    static double trianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter square side: ");
        double squareSide = input.nextDouble();
        System.out.println("Square area: " + squareArea(squareSide));
        System.out.println("Square perimeter: " + squarePerimeter(squareSide));

        System.out.print("\nEnter rectangle length: ");
        double length = input.nextDouble();

        System.out.print("Enter rectangle width: ");
        double width = input.nextDouble();
        System.out.println("Rectangle area: " + rectangleArea(length, width));
        System.out.println("Rectangle perimeter: " + rectanglePerimeter(length, width));

        System.out.print("\nEnter triangle base: ");
        double base = input.nextDouble();

        System.out.print("Enter triangle height: ");
        double height = input.nextDouble();

        System.out.print("Enter triangle side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter triangle side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter triangle side 3: ");
        double side3 = input.nextDouble();

        System.out.println("Triangle area: " + triangleArea(base, height));
        System.out.println("Triangle perimeter: "
                + trianglePerimeter(side1, side2, side3));

        System.out.print("\nEnter circle radius: ");
        double radius = input.nextDouble();
        System.out.println("Circle area: " + circleArea(radius));
        System.out.println("Circle perimeter: " + circlePerimeter(radius));

        input.close();
    }
}