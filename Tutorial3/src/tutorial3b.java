import java.util.Arrays;
import java.util.Scanner;

public class tutorial3b {

    /**
     * <h2>rmove</h2>
     * <p>
     *
     * </p>
     * 
     * @param arr
     * @param index
     * @return
     * @return int[]
     */
    public static int[] rmove(int[] arr, int index) {
        int[] narray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            narray[k++] = arr[i];
        }
        return narray;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 14, 56, 15, 36 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Index to be removed");
        int index = scanner.nextInt();
        arr = rmove(arr, index);
        System.out.println("Result" + Arrays.toString(arr));

    }
}
