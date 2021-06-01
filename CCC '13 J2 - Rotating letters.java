import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sign = in.next();
        int count = 0;
        
        for (int i = 0; i < sign.length(); i++) {
            if (sign.charAt(i) != 'I' &&
                    sign.charAt(i) != 'O' &&
                    sign.charAt(i) != 'S' &&
                    sign.charAt(i) != 'H' &&
                    sign.charAt(i) != 'Z' &&
                    sign.charAt(i) != 'X' &&
                    sign.charAt(i) != 'N'){
                System.out.println("NO");
                break;
            } else {
                count++;
                
                if (count == sign.length()){
                    System.out.println("YES");
                    break;
                }
            }
        }
    }
}
