import java.util.Arrays;

public class MergeSort {

    // 合并两个已排序的数组
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0; // 左数组的索引
        int j = 0; // 右数组的索引
        int k = 0; // 结果数组的索引

        // 遍历两个数组，按大小将元素放入结果数组
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // 将左数组剩余的元素添加到结果数组
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // 将右数组剩余的元素添加到结果数组
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    // 归并排序的递归实现
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    // 测试归并排序
    public static void main(String[] args) {
        int[] array = {11, 23, 3, 1, 98, -1, -4};
        array = mergeSort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
