import java.util.Scanner;

class agemethod{

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "Access denied! Under 18"
            );
        }

        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}