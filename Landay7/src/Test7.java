import java.util.Scanner;

public class Test7 {
    //走方格
    public static void main(String[] args) {
        int[][] arr=new int[31][31];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i%2==0&&j%2==0){
                    continue;
                }
                 if(i==1||j==1){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        System.out.println(arr[n][m]);
    }
}
