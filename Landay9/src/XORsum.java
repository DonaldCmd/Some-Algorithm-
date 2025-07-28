public class XORsum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 3, 6, 7, 5};

        int xorSum = 0;
        for (int num : arr) {
            xorSum ^= num;
        }

        System.out.println("数组的异或和为: " + xorSum);
    }
}
