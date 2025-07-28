public class demo1 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 2019; i++) {
            //将数字转成字符串
           String j=i+"";
           //将字符串转成字符数组 toCharArray()
            char[] cs=j.toCharArray();
            //System.out.print(cs);
            for(int k=0;k<cs.length;k++){
                if (cs[k] == '0' || cs[k] == '1' || cs[k] == '2' || cs[k]=='9'){
                    count+=i;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}