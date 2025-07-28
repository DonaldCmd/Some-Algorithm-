import java.math.BigInteger;
public class Main2 {
        public static void main(String[] args) {
            System.out.println(factorial(12345));
        }

        public static BigInteger factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("输入的数不能是负数");
            }
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

