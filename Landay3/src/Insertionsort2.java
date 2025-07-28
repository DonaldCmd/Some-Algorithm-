public class Insertionsort2 {
    public static void main(String[] args) {
        int arr[] = {10, 1, 35, 61, 89, 36, 55};
        for (int i = 1 ;i <=arr.length-1; i++) {
            int key=arr[i];
            int j=i-1;
            //当i=5,i=6的时候，while循环了两次
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
                //System.out.println(count);
                System.out.println(i);
            }
            //System.out.println(i);
            arr[j+1]=key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
