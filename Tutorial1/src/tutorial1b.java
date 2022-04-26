import java.util.Scanner;

public class tutorial1b {
    /**
    *<h2>main</h2>
    *<p>
    *
    *</p>
    * @param args
    *@return void
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        int alphabet = 65;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = rows - i; l >= 0; l--) {
                if (l != rows)
                    System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print((char) (alphabet + j));
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = rows - i; l >= 0; l--) {
                if (l != rows)
                    System.out.print((char) (alphabet + l));
            }
            System.out.println();
        }

    }
}
