import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalComputers = scanner.nextInt();
        int contaminationRate = scanner.nextInt();

        int infectedComputers = 1;
        int day = 1;

        while (infectedComputers < totalComputers) {
            infectedComputers = (int) Math.ceil(infectedComputers * contaminationRate);
            day++;
        }

        System.out.println(day-1);
    }
}
