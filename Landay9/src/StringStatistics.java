
import java.util.Arrays;
import java.util.Scanner;

public class StringStatistics {
    //字符统计
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] crr=str.toCharArray();
        int[] arr=new int[256];

        for(char c:crr) {
            arr[c]++;

        }

        int a=Arrays.stream(arr).max().getAsInt();

        for(int i=0;i<arr.length;i++) {

            if(arr[i]==a) {
                System.out.println((char)i);
            }



        }

    }

}

