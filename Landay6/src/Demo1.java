import java.util.Scanner;
//二维数组
//数组旋转

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//row number
        int m=sc.nextInt();//line number
        int a[][]=new int[n][m];//创建一个二维数组
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();//减少资源浪费

        
        for(int i=0;i<m;i++){
            for (int j=n-1;j>=0;j--){
                System.out.print(a[j][i]+"");
            }
            System.out.println();
        }
    }
}
