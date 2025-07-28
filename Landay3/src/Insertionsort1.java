public class Insertionsort1 {
    // 插入排序函数
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // 将比 key 大的元素都向后移动
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                //j = j - 1;
                i=i-1;
                System.out.println(i);
                System.out.println(j);
            }

            // 插入 key 到正确位置
            arr[i] = key;
        }
    }

    // 打印数组的工具函数
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // 主函数测试
    public static void main(String args[]) {
        int arr[] = {10, 1, 35, 61, 89, 36, 55};

        System.out.println("排序前的数组:");
        printArray(arr);

        // 调用插入排序函数
        insertionSort(arr);

        System.out.println("排序后的数组:");
        printArray(arr);
    }
}
