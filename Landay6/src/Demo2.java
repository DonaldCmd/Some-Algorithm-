import com.sun.jdi.PathSearchingVirtualMachine;

public class Demo2 {
    public static void main(String[] args) {
        String s="SLANQIAO" +
                "ZOEXCCGB" +
                "MOAYWKHI" +
                "BCCIPLJQ" +
                "SLANQIAO" +
                "RSFWFNYA" +
                "XIZVWAL" +
                "COAIQNAL";
        System.out.println(s);
        char[] cs=s.toCharArray();//将字符串转成字符数组
        int a=0;//字符数组的下标
        char[][] array=new char[8][8];
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++){
                array[i][j]=cs[a];
                a++;//字符串下标自增
            }
        }
        int count=0;//LANQIAO的个数
        //从左到右LANQIAO一共七个字符，遍历每一行，一次取七个字符和LANQIAO比对
        for(int i=0;i<8;i++) {
            for(int j=0;j<8;j++){
                char cd1[]={array[i][j],array[i][j+1],array[i][j+2],array[i][j+3],
                        array[i][j+4],array[i][j+5],array[i][j+6]};
                String s1=new String(cd1);
                if(s1.equals("LANQIAO")){
                    count++;
                }
                System.out.println("从左到右"+count);

            }
        }
        //从右到左
        for(int i=0;i<8;i++) {
            for(int j=7;j>=0;j++){
                char cd1[]={array[i][j],array[i][j-1],array[i][j-2],array[i][j-3],
                        array[i][j-4],array[i][j-5],array[i][j-6]};
                String s1=new String(cd1);
                if(s1.equals("LANQIAO")){
                    count++;
                }
                System.out.println("从右到左"+count);

            }
        }
        //斜着的就[i+1][j+1]或

        }

}
