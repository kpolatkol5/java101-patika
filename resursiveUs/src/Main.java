public class Main {
    static int exponentiation(int sub, int sup) {

        if (sup == 0) {
            return 1;
        }

        return sub * exponentiation(sub, sup - 1);
    }

    public static void main(String[] args) {


        System.out.println(exponentiation(2,5));
    }
}