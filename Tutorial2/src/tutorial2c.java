import java.util.Scanner;

public class tutorial2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year:");
        int a = scanner.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("Leap year");
                }

                else {
                    System.out.println("Not a Leap year");
                }
            } else {
                System.out.println("Not a Leap year");
            }

        } else {
            System.out.println("Not a Leap year");
        }

    }

}
