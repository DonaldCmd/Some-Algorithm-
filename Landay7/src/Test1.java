import java.math.BigInteger;

public class Test1 {
    //求7的2020次幂除以1921的余数
    //数字太大，用BigInteger
    public static void main(String[] args) {
        BigInteger x=new BigInteger("7");
        BigInteger y=new BigInteger("1921");
        BigInteger pow=x.pow(2020);
        BigInteger result=pow.remainder(y);
        System.out.println(result);
    }
}
