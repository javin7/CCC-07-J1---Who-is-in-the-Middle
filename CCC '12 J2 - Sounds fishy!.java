import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int depth1 = in.nextInt();
        int depth2 = in.nextInt();
        int depth3 = in.nextInt();
        int depth4 = in.nextInt();

        if (depth1 > depth2 && depth2 > depth3 && depth3 > depth4) {
            System.out.println("Fish Diving");
        } else if (depth1 == depth2 && depth2 == depth3 && depth3 == depth4) {
            System.out.println("Fish At Constant Depth");
        } else if (depth1 < depth2 && depth2 < depth3 && depth3 < depth4) {
            System.out.println("Fish Rising");
        } else {
            System.out.println("No Fish");
        }
    }
}
