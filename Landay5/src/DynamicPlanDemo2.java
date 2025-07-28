import java.util.HashMap;
import java.util.Map;

public class DynamicPlanDemo2 {
    //暴力递归的问题：存在大量运算
    //时间复杂度=解决子问题的时间*子问题个数
    //改进：通过字典存储子问题的解（数组或者map）
    public static void main(String[] args) {
        long l=System.currentTimeMillis();
        int way=ways(40);
        long l1=System.currentTimeMillis();
        System.out.println("有"+way+"种跳法");
        System.out.println(l1-l);
    }
     static Map<Integer,Integer> map=new HashMap<>();
    static int ways(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            map.put(n,ways(n-1)+ways(n-2));
            return map.get(n);
        }
    }
}
