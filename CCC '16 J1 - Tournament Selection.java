import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 6; i++) {
            String score = in.next();
            if (score.equals("W")) {
                count++;
            }
        }

        switch (count) {
            case 6:
            case 5:
                System.out.println(1);
                break;
            case 4:
            case 3:
                System.out.println(2);
                break;
            case 2:
            case 1:
                System.out.println(3);
                break;
            case 0:
                System.out.println(-1);
                break;
        }
    }
}
