public class shan {
    public static void main(String[] args) {
        int count=0;
        for(int i=2022;i<=2022222022;i++) {
            String str=String.valueOf(i);
            for(int j=0;j<str.length()/2-1;j++) {
                if(str.charAt(j)<=str.charAt(j+1)) {
                    for(int t=str.length()/2;t<str.length()-1;t++) {
                        if(str.charAt(t)>=str.charAt(t+1)) {
                            count++;
                        }
                    }
                }
           }
        }
        System.out.println(count);
    }
}
