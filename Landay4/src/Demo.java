public class Demo {
    public static void main(String[] args) {
        int count=0;

        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                System.out.print("i="+i);
                System.out.println("j="+j);
                count++;
            }
        }
        System.out.println("count="+count);
    }
}
