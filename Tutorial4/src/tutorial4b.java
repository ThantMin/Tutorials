import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tutorial4b {
    /**
    *<h2>main</h2>
    *<p>
    *
    *</p>
    * @param args
    *@return void
    */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Pink");

        Scanner scanner = new Scanner(System.in);
        System.out.print("First index to be swapped:");
        int i = scanner.nextInt();
        System.out.print("Second index to be swapped:");
        int j = scanner.nextInt();
        Collections.swap(list, i, j);
        System.out.println(list);

    }

}
