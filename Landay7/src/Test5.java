import java.util.Scanner;

public class Test5 {
    //分类计数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        int d=0;
        int x=0;
        int s=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                d++;
            }else if(c>='a'&&c<='z'){
                x++;
            }else if(c>='0'&&c<='9'){
                s++;
            }
        }
        System.out.println(d);
        System.out.println(x);
        System.out.println(s);
    }
}
