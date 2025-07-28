public class demo3 {
    public static void main(String[] args) {
        //切矩形
        int count=0;
        int length=2019;
        int width=324;
        /*while(length==0||width==0){
            System.out.println("wrong");
        }*/
        while(length!=width){
            while(length>width){
                count++;
                length=length-width;
            }
            while(length<width){
                count++;
                width=width-length;
            }
        }
        System.out.println(count+1);
        System.out.println(length);
        System.out.println(width);
    }
}

