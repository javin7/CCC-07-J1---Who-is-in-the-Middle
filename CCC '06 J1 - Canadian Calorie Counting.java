import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int burger = in.nextInt();
        int side = in.nextInt();
        int drink = in.nextInt();
        int dessert = in.nextInt();

        switch(burger) {
            case 1:
                burger = 461;
                break;
            case 2:
                burger = 431;
                break;
            case 3:
                burger = 420;
                break;
            case 4:
                burger = 0;
        }

        switch(side) {
            case 1:
                side = 100;
                break;
            case 2:
                side = 57;
                break;
            case 3:
                side = 70;
                break;
            case 4:
                side = 0;
        }

        switch(drink) {
            case 1:
                drink = 130;
                break;
            case 2:
                drink = 160;
                break;
            case 3:
                drink = 118;
                break;
            case 4:
                drink = 0;
        }

        switch(dessert) {
            case 1:
                dessert = 167;
                break;
            case 2:
                dessert = 266;
                break;
            case 3:
                dessert = 75;
                break;
            case 4:
                dessert = 0;
        }

        System.out.println("Your total Calorie count is " + (burger + side + drink + dessert) + ".");
        
    }
}
