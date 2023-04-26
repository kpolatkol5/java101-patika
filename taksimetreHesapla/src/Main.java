import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float km_basi_tutar = 2.20f;
        int  acilis_ucreti = 10;


        Scanner input = new Scanner(System.in);

        System.out.print("kac km gidildi : ");
        int kac_km_gidildi = input.nextInt();

        double result  = (kac_km_gidildi * km_basi_tutar) + acilis_ucreti >= 20 ? (kac_km_gidildi * km_basi_tutar) + acilis_ucreti : 20;

        System.out.println("Taksimetre Ücreti : " + result);
    }
}