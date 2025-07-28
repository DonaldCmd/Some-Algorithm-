import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = new ArrayList<>(); // 创建一个列表用于存放所有排列
        System.out.println("现在字符是"+str);
        permute(str, 0, str.length() - 1, permutations); // 调用递归函数生成排列
        //System.out.println(permutations);// 打印所有排列
        //System.out.println(permutations.size());// 打印数量
    }

    // 递归函数，用于生成字符串的全排列
    public static void permute(String str, int l, int r, List<String> permutations) {
        if (l == r) { // 如果指针l和r相等，表示已经生成一个排列
            permutations.add(str); // 将这个排列添加到列表中
            System.out.println("当前字符为 "+str);
        } else {
            for (int i = l; i <= r; i++) { // 遍历当前字符到末尾的所有字符
                str = swap(str, l, i); // 交换字符位置
                System.out.println(str);
                permute(str, l + 1, r, permutations); // 递归生成下一个字符的排列
                str = swap(str, l, i); // 恢复原始字符串的顺序，以便进行下一次交换
            }
        }
    }

    // 用于交换字符串中两个字符位置的辅助函数
    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray(); // 将字符串转换为字符数组
        char temp = charArray[i]; // 交换字符位置
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray); // 将字符数组转换为字符串并返回
    }
}
