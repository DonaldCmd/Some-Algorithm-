public class DynamicPlanDemo3 {
    public static void main(String[] args) {
        ways(10);
        System.out.println(ways(10));
    }
    /*动态规划的特征：
    最优子结构：f(n)=f(n-1)+f(n-2)
   状态转移方程:f(n)=f(n-1)+f(n-2)
   边界f(1)=1,f(2)=2
   重叠子：f(10)=f(9)+f(8);f(9)=f(8)+f(7)  f(8)就是重叠子
     */
    /*
    自底而上的动态规划，无需字典，可以用循环解决


  */
public static int ways(int n){
    if(n==1){
        return 1;
    }
    if(n==2){
        return 2;
    }
    int a=1;int b=2;int temp=0;
    for (int i = 3; i <=n; i++) {
        temp=a+b;
        a=b;
        b=temp;
    }
    return temp;
}
}
