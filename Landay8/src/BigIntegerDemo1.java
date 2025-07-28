import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

            // TODO Auto-generated method stub
            BigInteger bignum1=new BigInteger("123456789123456789");
            BigInteger bignum2=BigInteger.valueOf(1029302093);
            BigInteger bignum3 = BigInteger.valueOf(1234577);
            BigInteger sum=bignum1.add(bignum3);
            BigInteger difference=bignum2.subtract(bignum3);
            BigInteger product=bignum1.multiply(sum);
            BigInteger quotient=bignum1.divide(bignum2);
            BigInteger reminder=bignum1.remainder(quotient);
            int comparsion=bignum1.compareTo(bignum2);
            boolean isEqual=bignum1.equals(reminder);
            BigInteger absValue=bignum1.abs();
            BigInteger power=bignum1.pow(comparsion);
            System.out.println(sum);
            System.out.println(difference);
            System.out.println(product);
            System.out.println(quotient);
            System.out.println(reminder);
            System.out.println(comparsion);
            System.out.println(isEqual);
            System.out.println(absValue);
            System.out.println(power);

        }


    }


