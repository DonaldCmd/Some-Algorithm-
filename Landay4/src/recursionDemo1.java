public class recursionDemo1 {
    public static void main(String[] args) {
        System.out.println(Fn(20));
    }
    public static int Fn(long n){
        if(n==1||n==2){
            return 1;
        }
        return Fn(n-1)+Fn(n-2);
    }
}
