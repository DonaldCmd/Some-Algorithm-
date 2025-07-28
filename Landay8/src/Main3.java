public class Main3 {


    public static void main(String[] args) {
        /*int cnt = 0;
        for(int i=1; ; i++){
            if(check(i, 2) && check(i, 8) && check(i, 10) && check(i, 16)){
                cnt++;
            }
            if(cnt == 2023){
                System.out.println(i);
                break;
            }
        }*/
        boolean c=check(12,8);
        System.out.println(c);

    }

    //判断是否为mod进制下的哈沙德数
    public static boolean check(int x, int mod){
        int n = x;
        int ans = 0;
        while(x>0){
            ans = ans+ x%mod;
            x /= mod;
        }
        return n%ans==0;
    }
}

