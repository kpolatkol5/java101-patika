public class Main {

    static String[] reverseArray(String[] array) {
        String[] geciciDizi = new String[array.length];

        for(int i = array.length - 1; i >= 0; --i) {
            geciciDizi[array.length - 1 - i] = array[i];
        }

        return geciciDizi;
    }
    static String palimdromSayi(String sayi) {
        String[] str = sayi.split("");
        String[] strReverse = reverseArray(str);

        for(int i = 0; i < str.length; ++i) {
            if (!str[i].equals(strReverse[i])) {
                return "Bu sayi palindrom değildir";
            }
        }

        return "sayi palindromdur";
    }

    public static void main(String[] args) {
        System.out.println(palimdromSayi("9129"));
    }
}