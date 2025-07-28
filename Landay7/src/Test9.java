import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                String x = "" + a[i] + a[j];
                if (Integer.parseInt(x) <= k) {
                    num++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                String x = "" + a[j] + a[i];
                if (Integer.parseInt(x) <= k) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}



