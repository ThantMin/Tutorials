
/**
*<h2>4{type_name}Class</h2>
*<p>
*Process for Displayingfibonacci
*</p>
*
*@author ASUS
*
*/
public class fibonacci {

    public static void main(String[] args) {
        int i1 = 1, i2 = 2, i3, j, count = 10;

        System.out.print(i1 + "," + i2);

        for (j = 2; j < count; ++j) {
            i3 = i1 + i2;
            System.out.print("," + i3);
            i1 = i2;
            i2 = i3;
        }

    }
}
