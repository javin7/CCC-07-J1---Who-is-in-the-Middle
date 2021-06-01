import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfVotes = in.nextInt();
        int aCount = 0;
        int bCount = 0;
        String votes = in.next();

        for (int i = 0; i < numberOfVotes; i++)
        {
            if (votes.charAt(i) == 'A') {
                aCount++;
            }
            if (votes.charAt(i) == 'B') {
                bCount++;
            }
        }

        if (aCount > bCount) {
            System.out.println("A");
        } else if (bCount > aCount) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
