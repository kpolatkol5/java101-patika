import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi_1, sayi_2, secim;

        System.out.print("ilk sayiyi giriniz : ");
        sayi_1 = input.nextInt();

        System.out.print("ikinci sayiyi giriniz : ");
        sayi_2 = input.nextInt();

        System.out.print("\n Toplama icin : 1 \n  Cikartma icin : 2  \n Carpma icin :3 \n Bolme icin : 4 \n Cevap :  ");
        secim = input.nextInt();


        switch (secim) {

            case 1:
                System.out.println("Cevap : " + (sayi_1 + sayi_2));
                break;
            case 2:
                System.out.println("Cevap : " + (sayi_1 - sayi_2));
                break;
            case 3:
                System.out.println("cavap : " + (sayi_1 * sayi_2));
                break;
            case 4:

                if (sayi_1 == 0 || sayi_2 == 0) {
                    System.out.println("Sifira bolemezsin ;( ");
                    break;
                } else {
                    System.out.println("cavap : " + (sayi_1 / sayi_2));
                    break;
                }
            default:
                System.out.println("yanlis deger girildi");
                break;
        }

    }
}