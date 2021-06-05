import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int count = 0;
        ArrayList<String> answers = new ArrayList<String>();
        ArrayList<String> responses = new ArrayList<String>();
        int numOfResponses = in.nextInt();
        

        for (int i = 0; i < numOfResponses; i++) {
            String n = in.next();
            responses.add(n);            
        }
        
        for (int i = 0; i < numOfResponses; i++) {
            String n = in.next();
            answers.add(n);          
        }
    

        for (int i = 0; i < numOfResponses; i++) {
            if ((responses.get(i)).equals(answers.get(i))) {
                count++;
            }       
        }

        System.out.print(count);
    }
}
