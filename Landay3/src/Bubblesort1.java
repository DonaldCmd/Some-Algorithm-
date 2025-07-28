public class Bubblesort1 {
    //排序与算法
    //冒泡排序，插入排序，选择排序
    //冒泡排序：比较两个相邻的元素，将较大的值交换到右边
    public static void main(String[] args) {
        int arr[]={10,1,35,61,89,36,55};
        //int arr[]={2,4,6,2,4,6};

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    /*int temp=i;
                    i=j;
                    j=temp;*/
                    //System.out.println(arr[i]);
                }
            }
            System.out.println(arr[i]);
        }
    }
}
