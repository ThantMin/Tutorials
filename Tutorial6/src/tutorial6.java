import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.io.IOException;
import java.util.Scanner;

public class tutorial6 {
    /**
    *<h2>main</h2>
    *<p>
    *
    *</p>
    * @param args
    *@return void
    */
    public static void main(String args[]) {
        String filePath = "D:\\last\\fie.txt";
        File file = new File(filePath);
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println("Given file was last modified at: ");
        System.out.println(date);

        System.out.print("Enter Text to Append");
        Scanner scanner = new Scanner(System.in);
        String appendtext = scanner.nextLine();

        try (FileOutputStream out = new FileOutputStream(filePath, true)) {
            byte[] strtobyte = appendtext.getBytes();
            out.write(strtobyte);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
