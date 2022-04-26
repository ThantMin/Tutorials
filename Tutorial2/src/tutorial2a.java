import java.util.Scanner;

/**
*<h2>4{type_name}Class</h2>
*<p>
*Process for Displayingtutorial2a
*</p>
*
*@author ASUS
*
*/
public class tutorial2a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
}
