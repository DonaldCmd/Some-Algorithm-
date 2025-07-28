public class Bubblesort2 {
    // 冒泡排序函数
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // 如果当前元素大于下一个元素，则交换它们
                if (arr[j] > arr[j+1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("排序前的数组:");
        printArray(arr);

        // 调用冒泡排序函数
        bubbleSort(arr);

        System.out.println("排序后的数组:");
        printArray(arr);
    }
}
