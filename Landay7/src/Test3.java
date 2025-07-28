public class Test3 {
    public static void main(String[] args) {
        //核酸检测
        int min=99999;//代表最少需要的试剂盒数量
        int answer=-1;//每组人数的最佳值
        for(int i=1;i<=100;i++){
            int x;//需要多少试剂盒
            if(100%i!=0){
                x=100/i+1+i;
            }else{
                x=100/i+i;
            }
            if(x<min){
                min=x;
                answer=i;
            }
        }
        System.out.println(answer);
    }
}
