public class DynamicPlanDemo1 {
    //动态规划：一个问题，拆成多个子问题，解决子问题
    //核心思想：拆分子问题，记住过程，减少重复运算
    //暴力递归
    //一只青蛙，可以一次跳上一个台阶，也可以一次跳上两个台阶，求青蛙跳十级台阶有多少种跳法
    //如果一个问题的答案可以被穷举出来，并且存在重叠子问题，就可以考虑动态规划
    public static void main(String[] args) {
        long l=System.currentTimeMillis();
        int way=ways(40);
        long l1=System.currentTimeMillis();
        System.out.println("有"+way+"种跳法");
        System.out.println(l1-l);
    }
    static int ways(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return ways(n-1)+ways(n-2);
    }
}
