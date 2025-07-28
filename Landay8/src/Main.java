import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int y = 0;
        int f = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                y++;
            }else {
                f++;
            }
        }
        System.out.println(y);
        System.out.println(f);
    }

}


