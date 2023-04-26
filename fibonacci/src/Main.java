public class Main {
    static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            return result;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; ++i) {
            System.out.print(fibonacci(i) + ",");
        }
    }
}