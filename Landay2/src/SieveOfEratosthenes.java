public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int upperLimit = 20000; // 你可以根据需要设置一个上限值
        boolean[] isPrime = new boolean[upperLimit + 1];

        // 初始化，假设所有数都是质数
        for (int i = 2; i <= upperLimit; i++) {
            isPrime[i] = true;
        }

        // 埃拉托斯特尼筛法
        for (int i = 2; i <= Math.sqrt(upperLimit); i++) {
            if (isPrime[i]) {
                // 将 i 的倍数标记为非质数
                for (int j = i * i; j <= upperLimit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 输出所有质数
        System.out.println("质数列表：");
        for (int i = 2; i <= upperLimit; i++) {
            if (isPrime[i]) {
                System.out.println(i + " ");
            }
        }
    }
}

