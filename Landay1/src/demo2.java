public class demo2 {
    public static void main(String[] args) {
        //一些数字的立方的末尾正好是该数字本身。在10000以内的数字，符合这个特征的正整数有几个
        //分析：已知循环次数，用for循环。可以将数字和数字的立方转成字符串。
        // str.endsWith(str2):判断字符串str是否以字符串str2结尾
        int count =0;
        for(double i=1;i<=Math.pow(10,4);i++){
            double cube=Math.pow(i,3);
            String num=i+"";
            String cub=cube+"";
            if(cub.endsWith(num)){
                count++;
                System.out.println(num);
                System.out.println(cub);
            }
        }
        System.out.println(count);
    }
}
