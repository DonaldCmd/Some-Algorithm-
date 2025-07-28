public class Selectionsort2 {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // 找到未排序部分的最小元素的索引
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 将找到的最小元素与当前元素交换位置
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        // 调用选择排序函数
        selectionSort(arr);

        System.out.println("排序后的数组:");
        printArray(arr);
    }
}
