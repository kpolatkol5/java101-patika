public class helperArray {

    public static int avgArray(int[] array) {

        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;
    }

    public static double harmoikAvgOfArray(int[] array) {
        double result = 0;

        for (double i : array) {
            result += (1 / i);
        }
//        System.out.println(array.length);
//        System.out.println(result);

        return array.length / result;
//    return 0;
    }
}

