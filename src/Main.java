import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int r = random.nextInt(1, 3);
        int s = scanner.nextInt();
        int s1 = scanner.nextInt();
        Lift lift = new Lift (s,s1,18);
        System.out.println(lift);
        lift.toFloor();
        lift.floor();
        lift.weight();

    }

}