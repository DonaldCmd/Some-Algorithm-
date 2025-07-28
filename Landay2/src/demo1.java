import java.util.HashSet;
import java.util.Objects;

public class demo1 {
    public static void main(String[] args) {
           String string="0100110001010001";
        HashSet<Object> set=new HashSet<>();//去重
        for(int i=0;i<string.length();i++){//控制从第几个下标截取
            for(int j=i;j<string.length();j++){
                String s=string.substring(i,j+1);
                set.add(s);
            }
        }
        System.out.println(set.size());
    }
}
