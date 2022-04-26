import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <h2>4{type_name}Class</h2>
 * <p>
 * Process for Displayingtutorial5
 * </p>
 *
 * @author ASUS
 *
 */
public class tutorial5 {

    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "red");
        colors.put(2, "blue");
        colors.put(3, "green");
        colors.put(4, "black");
        colors.put(5, "pink");

        HashMap<Integer, String> another = new HashMap<Integer, String>();
        another.put(6, "white");

        for (Map.Entry m : colors.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        another.putAll(colors);
        System.out.println(another);

        System.out.print("Enter key:");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(" Is key " + i + " exists?");

        if (colors.containsKey(i)) {
            System.out.println("yes! - " + colors.get(i));

        } else {
            System.out.println("no!");
        }

    }

}
