import java.util.Scanner;

class Prompt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        String str = sc.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println("Integer: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid integer format!");
        }

        sc.close();
    }
}