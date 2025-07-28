import java.util.Scanner;

public class chocolate{
    public static void main(String[] args) {
        // 使用更具有描述性的变量名
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        // 输入验证
        int boardSize = 0;
        int targetSquares = 0;
        while (true) {
            try {
                System.out.print("请输入巧克力板的大小 N：");
                boardSize = scanner.nextInt();
                if (boardSize <= 0) {
                    System.out.println("巧克力板的大小必须为正数。");
                    continue;
                }

                System.out.print("请输入目标切割的正方形数量 k：");
                targetSquares = scanner.nextInt();
                if (targetSquares <= 0) {
                    System.out.println("目标正方形数量必须为正数。");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入。");
                scanner.nextLine(); // 清除错误输入
            }
        }

        int[][] chocolate = new int[boardSize][2];
        for (int i = 0; i < boardSize; i++) {
            // 限定只读入两列数据
            for (int j = 0; j < 2; j++) {
                System.out.print("请输入第 " + (i + 1) + " 行第 " + (j + 1) + " 列的巧克力块数：");
                chocolate[i][j] = scanner.nextInt();
                if (chocolate[i][j] < 0) {
                    System.out.println("巧克力块数不能为负数。");
                    // 重置为默认值，此处假设为1，实际应根据逻辑调整
                    chocolate[i][j] = 1;
                }
            }
        }

        int length = 1; // 切的正方形的边长
        int temp = 0; // 切出的正方形个数
        while (flag) {
            for (int i = 0; i < boardSize; i++) {
                temp += (chocolate[i][0] / length) * (chocolate[i][1] / length);
                if (temp >= targetSquares) {
                    length++;
                } else {
                    flag = false;
                    break; // 当找到满足条件的最小边长时，跳出内部循环
                }
            }
            if (!flag) break; // 若已找到满足条件的最小边长，跳出外部循环
        }

        System.out.println("至少需要切割的正方形边长为：" + length);
    }
}



