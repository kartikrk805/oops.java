public class whilepr {
    public static void main(String[] args) {
        int i = 1;
        int x= 0;
        while (i <= 10) {
            x = x + (2 * i);
            i++;
        }
        System.out.println("Sum = " + x);
    }
}