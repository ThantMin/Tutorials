
/**
*<h2>4{type_name}Class</h2>
*<p>
*Process for Displayingtutorial3a
*</p>
*
*@author ASUS
*
*/
public class tutorial3a {

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 7, 9 };
        int length = arr.length;

        float average = 0;
        float sum = 0;
        for (int num : arr) {
            sum = sum + num;

        }

        average = sum / length;
        System.out.print("Average is:" + average);

    }

}
