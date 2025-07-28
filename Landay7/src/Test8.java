import java.util.Scanner;

public class Test8 {
    //字符串编码
    public static void main(String[] args) {
        char [] a={'3','a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                'o','p','q','x','y','z'};
        //'3'是用来占位的
        Scanner sc=new Scanner(System.in);
        String i=sc.next();
        char[] c=i.toCharArray();
        for(int j=0;j<c.length;j++){
            String x=""+c[j]+c[j+1];
            int i1=Integer.parseInt(x);
            if(i1>=1&&i1<=26){
                System.out.print(a[i1]);
                j++;
            }else{
                System.out.print(a[j]);
            }
        }
    }
}
