public class demo4 {
    public static void main(String[] args) {
        int day=1;
        int money=1;
        int sum=0;
        while(sum<108){
            money=money+2;
            sum=sum+money;
            day++;
        }
        System.out.println(day);
        System.out.println(money);
        System.out.println(sum);
    }
}
