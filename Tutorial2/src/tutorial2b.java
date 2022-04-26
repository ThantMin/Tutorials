import java.util.Scanner;

public class tutorial2b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a = scanner.nextInt();
        System.out.print("Enter second Number:");
        int b = scanner.nextInt();
        System.out.print("Enter third Number:");
        int c = scanner.nextInt();

        System.out.println("Expected Output");

        if (a > b) {

            if (a > c) {

                System.out.println("The greatest:" + a);

            }

            else if (a < c) {
                System.out.println("The greatest:" + c);

            }

        }

        else if (a < b) {
            if (b > c) {

                System.out.println("The greatest:" + b);

            }

            else if (b < c) {
                System.out.println("The greatest:" + c);

            }

        }

    }
}
