public class Test2 {
    public static void main(String[] args) {
        //跑步训练
        int a=10000;
        int count=0;
        boolean b=true;
        while(true){
            if(a<600&&b){
                break;
            }
            if(b==true&&a>600){
                a-=600;
                b=false;
            }else{
                a+=300;
                b=true;

            }
            count++;
        }
        System.out.println(count*60+a/10);
    }
}
