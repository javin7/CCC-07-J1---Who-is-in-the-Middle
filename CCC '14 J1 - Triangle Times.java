import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int angle1 = in.nextInt();
        int angle2 = in.nextInt();
        int angle3 = in.nextInt();

        if (angle1 + angle2 + angle3 != 180) {
            System.out.print("Error");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.print("Equilateral");
        } else if ((angle1 == angle2 && angle2 != angle3) || (angle1 == angle3 && angle3 != angle2) || (angle3 == angle2 && angle2 != angle1)) {
            System.out.print("Isosceles");
        } else if (angle1 != angle2 && angle2 != angle3 && angle3 != angle1) {
            System.out.print("Scalene");
        }

    }
}
