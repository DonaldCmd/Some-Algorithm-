public class recursionDemo2 {
    public static void main(String[] args) {
        System.out.println(result(20));
    }
    //递归代码简洁，计算量呈指数级增加
    //使用递归的问题都可以用循环做，循环的时间复杂度更低
    //使用循环解决的问题不是全部可以换成循环
    //加字典
    public static int result(int n){
        if(n==1){
            return 1;
        }

        //return result(n-1)+(n-1)*(result(n-1)-result(n-2));
        return result(n-1)+(n-1)*4;
    }
}
