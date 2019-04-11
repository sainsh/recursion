public class Main {

    public static void main(String[] args) {


        for (int i = 1; i < 20; i++) {
            System.out.println(recursion(i));
        }


    }

    private static int recursion(int i) {

        if (i <= 1) {
            return 0;
        } else if (i == 2) {
            return 1;
        } else {
            return recursion(i - 1) + recursion(i - 2);
        }
    }


}
