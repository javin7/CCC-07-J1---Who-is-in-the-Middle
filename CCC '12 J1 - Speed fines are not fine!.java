import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int speedLimit = in.nextInt();
        int recordedSpeed = in.nextInt();
        int speedDifference = recordedSpeed - speedLimit;
        

        if (recordedSpeed <= speedLimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            int fine = 0;
            if (speedDifference >= 1 && speedDifference <= 20) {
                fine = 100;
            } else if (speedDifference >= 21 && speedDifference <= 30) {
                fine = 270;
            } else if (speedDifference >= 31) {
                fine = 500;
            }
            System.out.format("You are speeding and your fine is $%d.",fine);
        }

    }
}
