import com.sun.jdi.PathSearchingVirtualMachine;

import java.lang.reflect.Array;

public class demo3 {
    //循环求质数
    //最小的质数是2
    //一直第一个质数是2，第二个质数是3，第三个质数5.。。。。。。
    //算出第2024个质数
    //先求质数，然后把求出的质数放入一个list里面，取出下标为2022的，就是第2023个质数
    public static boolean isPrime(int num){
            if(num<=1){
                return false;
            }
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }





    public static void main(String[] args) {
            int count=1;
            int num=0;
        while (true) {
            num++;
            boolean a=isPrime(num);
            if(a==true){
                count++;
            }
            if(count==2024){
                System.out.println(num);
                break;
            }

        }

    }
    }

