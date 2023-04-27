import java.util.Scanner;

public class Main {

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    static int exponentiation(int sub, int sup) {

        if (sup == 0) {
            return 1;
        }

        return sub * exponentiation(sub, sup - 1);
    }

    static int faktoryel(int a) {
        if (a == 0) {
            return 1;
        }
        int result = a * faktoryel(a - 1);
        return result;
    }

    static void dikdortgen(int a, int b) {
        System.out.println("dikdörtgenin alanı : " + (a * b));
        System.out.println("dikdörtgenin çevresi : " + (2 * (a + b)));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String tablo = """
                *** HOŞGELDİNİZ İŞLEMİ SEÇİNİZ ÇIKMAK İÇİN '0' TUŞLAYIN
                 1- Toplama İşlemi
                 2- Çıkarma İşlemi
                 3- Çarpma İşlemi
                 4- Bölme işlemi
                 5- Üslü Sayı Hesaplama
                 6- Faktoriyel Hesaplama
                 7- Mod Alma
                 8- Dikdörtgen Alan ve Çevre Hesabı
                 """;


        while (true) {
            System.out.println("\n");

            System.out.println(tablo);
            System.out.print("Yapmak istediğiniz işlemi giriniz :    ");
            int secim = scan.nextInt();

            if (secim == 0) {
                System.out.println("** Güle Güle **");
                break;
            } else {
                switch (secim) {
                    case 1:

                        System.out.println("** 1- Toplama İşlemi **");
                        System.out.print("ilk degeri girin : ");
                        int a = scan.nextInt();

                        System.out.print("ikinci degeri girin : ");
                        int b = scan.nextInt();

                        System.out.println("Cevap : " + addition(a, b));
                        break;
                    case 2:
                        System.out.println("** 1- Çıkartma  İşlemi **");
                        System.out.print("ilk degeri girin : ");
                        int cikartma_ilk = scan.nextInt();

                        System.out.print("ikinci degeri girin : ");
                        int cikartma_iki = scan.nextInt();

                        System.out.println("Cevap : " + subtraction(cikartma_ilk, cikartma_iki));
                        break;

                    case 3:
                        System.out.println("** 1- Çarpma  İşlemi **");
                        System.out.print("ilk degeri girin : ");
                        int carpma_ilk = scan.nextInt();

                        System.out.print("ikinci degeri girin : ");
                        int carpma_iki = scan.nextInt();

                        System.out.println("Cevap : " + multiplication(carpma_ilk, carpma_iki));
                        break;
                    case 4:
                        System.out.println("** 1- Bölme  İşlemi **");
                        System.out.print("ilk degeri girin : ");
                        int bolme_ilk = scan.nextInt();

                        System.out.print("ikinci degeri girin : ");
                        int bolme_iki = scan.nextInt();

                        System.out.println("Cevap : " + division(bolme_ilk, bolme_iki));
                        break;

                    case 5:
                        System.out.println("** 1- Üs Alma  İşlemi **");
                        System.out.print("alt degeri girin : ");
                        int us_alt = scan.nextInt();

                        System.out.print("üst degeri girin : ");
                        int us_ust = scan.nextInt();

                        System.out.println("Cevap : " + exponentiation(us_alt, us_ust));
                        break;
                    case 6:
                        System.out.println(" ** Faktoryel ** ");
                        System.out.print("hangi sayının faktoryeli hesaplansın : ");
                        int faktoryelDeger = scan.nextInt();
                        System.out.println(faktoryel(faktoryelDeger));
                        break;
                    case 7:
                        System.out.println("** 1- Mod Alma  İşlemi **");
                        System.out.print("ilk degeri  girin : ");
                        int mod_ilk = scan.nextInt();

                        System.out.print("ikinci degeri  girin : ");
                        int mod_iki = scan.nextInt();

                        System.out.println("Cevap : " + modulus(mod_ilk, mod_iki));
                        break;
                    case 8:
                        System.out.println("** 1- Dikdörtgen alan ve çevre  İşlemi **");
                        System.out.print("uzun kenar degerini girin : ");
                        int uzunKenar = scan.nextInt();

                        System.out.print("kısa kenar degerini girin : ");
                        int kisaKenar = scan.nextInt();

                        dikdortgen(kisaKenar, uzunKenar);
                        break;

                }
            }
        }

    }
}