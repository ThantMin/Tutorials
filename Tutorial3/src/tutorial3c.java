import java.util.ArrayList;
import java.util.Arrays;

/**
*<h2>4{type_name}Class</h2>
*<p>
*Process for Displayingtutorial3c
*</p>
*
*@author ASUS
*
*/
public class tutorial3c {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Python");
        list.add("Java");
        list.add("Php");
        list.add("Perl");
        list.add("C#");

        Object[] object = list.toArray();
        for (Object obj : object) {
            System.out.print(obj + " ");
        }

    }
}
