import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class tutorial6c {

    public static void main(String a[]) {
        BufferedReader br = null;
        String strline = "";
        try {
            LineNumberReader reader = new LineNumberReader(
                    new InputStreamReader(new FileInputStream("D:\\last\\fie.txt"), "UTF-8"));
            while (((strline = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strline);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
