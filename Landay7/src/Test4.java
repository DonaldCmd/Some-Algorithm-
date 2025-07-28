public class Test4 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <=2; i++) {
            a=a+4;
            for(int j=1;j<=5;j++){
                for(int t=1;t<=6;t++){
                    a=a+5;
                }
                a=a+7;
            }
            a=a+8;
        }
        a=a+9;
        System.out.println(a);
    }
}
