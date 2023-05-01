import java.util.Arrays;

public class minMaxHelper {

    public static void minMaxFind(int[] array, int val) {

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);

        int indis = 0;

        for (int i : arrayCopy) {
            if (val < i) {
                indis = Arrays.binarySearch(arrayCopy, i);
                break;
            }
        }
        String result  = String.format("aranacak değer :%d\n en yakin max deger : %d\n en yakin min deger: %d",
                val,
                arrayCopy[indis] == 0 ? "bulunamadi" : arrayCopy[indis],
                arrayCopy[indis] == 0 ? "bulunamadi" : arrayCopy[indis - 1]);
        System.out.println(result);

    }

}
