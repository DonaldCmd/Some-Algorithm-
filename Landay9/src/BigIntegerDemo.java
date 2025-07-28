import java.math.BigInteger;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class BigIntegerDemo {
    public static void main(String[] args) {
        System.out.println(factorial(40));
        System.out.println(sum(40));

    }
    static Map<Integer, BigInteger> map=new HashMap<>();
    public static BigInteger factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("不能输入负数");
        }
        if(n==0||n==1){
            return BigInteger.ONE;
        }
        if(!map.containsKey(n)){
            map.put(n,BigInteger.valueOf(n).multiply(factorial(n-1)));
        }
        return map.get(n);

    }
    public static BigInteger sum(int n){
        BigInteger sum=BigInteger.ZERO;
        for(int i=1;i<=n;i++){
            sum=sum.add(factorial(i));
        }
        return sum;

    }

}
