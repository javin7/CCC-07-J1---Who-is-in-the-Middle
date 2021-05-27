public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bear1 = in.nextInt();
        int bear2 = in.nextInt();
        int bear3 = in.nextInt();

        int[] bearList = new int[3];
        bearList[0] = bear1;
        bearList[1] = bear2;
        bearList[2] = bear3;

        Arrays.sort(bearList);
        System.out.println("The weight of momma bear's bowl is " + bearList[1]);
    }
}
