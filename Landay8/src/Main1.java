

// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main1 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 40; i++) {   //通过测试可知40的阶乘的末尾9个数字已全为0，所以其后面的所有数字的和并不会影响
            // 最终结果的末尾9位数字, 可直接忽略
            long temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= j;
                temp = temp % 1000000000l;
            }
            sum += temp;
        }
        System.out.println(sum % 1000000000l);
    }
}
