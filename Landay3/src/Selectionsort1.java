public class Selectionsort1 {
    public static void main(String[] args) {
        //String arr[]={"腾讯","阿里巴巴","京东","字节跳动",};
        //选择排序
        //没整明白
        int arr[]={10,1,35,61,89,36,55};
        int begin=0;
        int end=arr.length-1;
        while(begin<end){
            int min=arr[begin];
            int temp=begin;//存储最小值的下标
            for (int i = begin+1; i <=end ; i++) {
                if(min>arr[i]){
                    min=arr[i];
                    temp=i;
                }
            }
            arr[temp]=arr[begin];
           arr[begin]=min;
            begin++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
