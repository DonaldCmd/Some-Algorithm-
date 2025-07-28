import java.util.Scanner;

public class Num {
    public static void main(String[] args) {

        int count=0;
        for(int i=125;i<=1000;i++){
            if(i%2==1){
                count=count+i;


            }else{
                while(i%2==0){
                    i=i/2;
                }
                count=count+i;

            }
        }
        System.out.println(count/125);


    }

}
