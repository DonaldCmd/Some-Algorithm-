public class Test10 {
    //跑步锻炼
    //小李锻炼身体，每天1000米，如果是周一或者月初（1号），跑两千米，若某天既是月初也是一号，也是跑2000米
    //他从2000年一月一日（周六）到2020年10月1日周四（含）一直跑，问他一共跑了多少千米
    public static void main(String[] args) {
        int[] numofday={0,31,28,31,30,31,30,31,31,30,31,30,31};//0用来占位
        int[] numofday2={0,31,29,31,30,31,30,31,31,30,31,30,31};
        int week=6;//星期的初始值
        int num=0;//跑步的公里数
        for(int nian=2000;nian<=2020;nian++) {
            if (nian == 2020) {
                for (int yue = 1; yue <= 9; yue++) {
                    for (int ri = 1; ri <= numofday2[yue]; ri++) {
                        if (ri == 1 || week == 1) {
                            num = num + 2;
                        } else {
                            num++;
                        }
                        week = (week + 1) % 7;
                    }
                }
            } else if (nian % 4 == 0 && nian % 100 != 0 || nian % 400 == 0) {//闰年
                for (int yue = 1; yue <= 12; yue++) {
                    for (int ri = 1; ri <= numofday2[yue]; ri++) {
                        if (ri == 1 || week == 1) {
                            num = num + 2;
                        } else {
                            num++;
                        }
                        week = (week + 1) % 7;
                    }
                }
            } else {
                for (int yue = 1; yue <= 12; yue++) {
                    for (int ri = 1; ri <= numofday[yue]; ri++) {
                        if (ri == 1 || week == 1) {
                            num = num + 2;
                        } else {
                            num++;
                        }
                        week = (week + 1) % 7;
                    }
                }
            }
        }
        System.out.println(num+2);
    }
}

