import java.util.Scanner;

public class recursionDemo3 {
    //辗转相除法：求最大公约数
    //两个整数的最大公约数等于其中较小的数和两数相除余数的最大公约数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(a<b){
            int temp=b;
            b=a;
            a=temp;
        }
        if (a==b) {
            return a;
        }
        if(a>b&&b!=0){
            return gcd(b,a%b);
        }
        return a;
    }

}
