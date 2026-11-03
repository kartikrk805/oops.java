public class areaandperimeter {
    
    static void square(int side) {
        int area = side * side;
        int perimeter = 4 * side;
        System.out.println("Square:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
    static void rectangle(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Rectangle:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    static void triangle(int a, int b, int c) {
        int perimeter = a + b + c;
        int area = (int) (0.5 * a * b);
        
        System.out.println("Triangle:");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        square(5);
        rectangle(4, 6);
        triangle(3, 4, 5);
    }
    
}