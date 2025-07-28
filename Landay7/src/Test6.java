import java.util.Scanner;

public class Test6 {
    //整除序列
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        while(i!=0){
            System.out.print(i+" ");
            i=i/2;
        }
    }
}
