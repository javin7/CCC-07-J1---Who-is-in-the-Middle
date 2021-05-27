import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        
        int age1 = Obj.nextInt();
        int age2 = Obj.nextInt();
        
        System.out.print(age2*2 - age1);
    }
}
