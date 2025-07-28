public class demo4 {

        public static void main(String[] args) {
            int n = 9999191 ;
            int count = 0;
            int number = 2; // 从2开始逐一检查质数

            while (count < n) {
                if (isPrime(number)) {
                    count++;
                    if (count == n) {
                        System.out.println("第 " + n + " 个质数是: " + number);
                    }
                }
                number++;
            }
        }

        // 判断一个数是否为质数的方法
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


