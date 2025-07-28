public class permutationDemo2 {
    //三角形求和：回溯法
    static int num []=new int[10];
    static int count =0;
    static boolean bool[]=new boolean[10];

    public static void main(String[] args) {
        dfs(1);
        System.out.println(count/3/2);

    }

    public static void dfs(int step) {
        if(step==10){
            if (num[1] + num[2] + num[4] + num[6]==num[6]+num[7]+num[8]+num[9]&&
                    num[6]+num[7]+num[8]+num[9]==num[1]+num[3]+num[5]+num[9]){
                count++;

            }
        }
        for (int i = 1; i < 10; i++) {
            if(!bool[i]){
                bool[i]=true;
                num[step]=i;
                dfs(step+1);
                bool[i]=false;
            }
        }

    }

}
