import java.util.Scanner;

public class BFSdemo1 {
    //数字三角形
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入行数");
        int n =sc.nextInt();
        int [][]array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=n-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                array[i-1][j]+=array[i][j]>array[i][j+1]?array[i][j]:array[i][j+1];
            }
        }
        System.out.println(array[0][0]);
    }
}


