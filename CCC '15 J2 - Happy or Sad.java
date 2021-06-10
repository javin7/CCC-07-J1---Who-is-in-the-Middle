import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        int count = 0;
        boolean includes = false;
        
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ':' && string.charAt(i+1) == '-') {
                if (string.charAt(i+2) == ')') {
                    count++;
                    includes = true;
                }else if (string.charAt(i+2) == '('){
                    count--;
                    includes = true;
                }
            }
        }
        
        if (count > 0) {
            System.out.println("happy");
        } else if (count < 0) {
            System.out.println("sad");
        } else if (count == 0 && includes) {
            System.out.println("unsure");
        } else {
            System.out.println("none");
        }
    } 
}
