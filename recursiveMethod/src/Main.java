public class Main {
    static int f(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            int result = n + f(n - 1);
            System.out.println("result ==> " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(f(4));
    }
}