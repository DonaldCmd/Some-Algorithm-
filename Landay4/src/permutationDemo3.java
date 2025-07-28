public class permutationDemo3 {
//三角形求和：邻里交换法
    static int count;
    static int a[]={1,2,3,4,5,6,7,8,9};


    public static void main(String[] args) {
        dfs(a,0);
        System.out.println(count/6);
    }
    public static void dfs(int a[],int step){
        if(step==a.length-1){
            if(a[0]+a[1]+a[2]+a[3]==a[3]+a[4]+a[5]+a[6]&&
            a[6]+a[7]+a[8]+a[0]==a[3]+a[4]+a[5]+a[6]){
                count++;
            }

        }
        for(int i =step;i<a.length;i++){
            {
                int x=a[i];
            a[i]=a[step];
            a[step]=x;
            }
            dfs(a,step+1);
            {
                int x = a[i];
                a[i] = a[step];
                a[step] = x;
            }
        }
    }
}
