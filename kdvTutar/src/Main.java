import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float buyuk_kdv_tutar   =   1.8f;
        float kucuk_kdv_tutar   =   0.8f;

        System.out.print("Hesaplanacak degeri giriniz : ");
        double deger = input.nextDouble();

        double result = deger > 1000 ? deger+(deger * buyuk_kdv_tutar) : deger + (deger * kucuk_kdv_tutar);

        System.out.println("kdv tutari : " + (deger > 1000 ? buyuk_kdv_tutar : kucuk_kdv_tutar));
        System.out.println("kdv dahil tutar : " + result);
        System.out.println("kdv siz tutar : " + deger);
    }
}