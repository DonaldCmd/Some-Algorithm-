import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeastExercises {
    // 最少刷题数
    /*public static void main(String[] args) {
        int N = 5;
        int[] arr = { 12, 10, 15, 20, 6 };
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map1.put(i, arr[i]);
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        for (int i = 0; i < N; i++) {
            map2.put(i, sortedArr[i]);
        }

        for (int i = 0; i < N; i++) {
            int diff;
            if (N % 2 == 1) {
                diff = Math.abs(sortedArr[i] - sortedArr[N / 2]) + 1;
            } else {
                diff = Math.abs(sortedArr[i] - sortedArr[N / 2 - 1]) + 1;
            }
            map3.put(i, diff);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(map3.get(i) + " ");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int[] arr=new int[N];

        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        Map<Integer,Integer> map3=new HashMap<>();
        for(int i=0;i<N;i++) {
            map1.put(i,arr[i]);
        }
		/*for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			map1.put(i,arr[i]);
			}*/
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                map2.put(i, arr[i]);
            }
        }
        if(N%2==1) {
            int temp=arr[N/2]+1;
            for(int i=0;i<arr.length;i++) {
                if(i>N/2) {
                    int diff=temp-arr[i];
                    arr[i]=diff;
                }else {
                    arr[i]=0;
                }
                System.out.println(arr[i]);
            }
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr.length;j++) {
                    if(map1.get(i)==map2.get(j)) {
                        map3.put(i,arr[j]);
                    }
                }
            }
        }
        if(N%2==0) {
            int temp=arr[N/2-1]+1;
            for(int i=0;i<arr.length;i++) {
                if(i>=N/2) {
                    int diff=temp-arr[i];
                    arr[i]=diff;
                }else {
                    arr[i]=0;
                }
                //System.out.println(arr[i]);
            }
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr.length;j++) {
                    if(map1.get(i)==map2.get(j)) {
                        map3.put(i,arr[j]);
                    }
                }
            }

        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(map3.get(i)+" ");
        }
    }
}