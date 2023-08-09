import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km : ");
        int mesafe = input.nextInt();

        System.out.print("Yas : ");
        int yas = input.nextInt();

        System.out.print("TİP (1=> GİDİS 2 => GİDİŞ DÖNÜŞ) : ");
        int tip = input.nextInt();
        System.out.println(tip);
        if (mesafe > 0 && yas>0 && (tip ==1 || tip == 2 ) ){
            double tutar;
            if (tip == 2){
                 tutar = (mesafe*2) * 0.10 ;
                System.out.println("gidis dönüş inidirimi uygulandı ");
                tutar = tutar - (tutar*20) / 100;
            }
            else {
                 tutar = mesafe * 0.10;
            }

            if (yas <12 ){
                System.out.println("yas indirimi uygulandı : yas => "+ yas + " "+"\b Tutar = " + (tutar -  (tutar * 50 / 100)));
            } else if (yas > 12 && yas < 24) {
                System.out.println("yas indirimi uygulandı  yas => "+ yas + " " +"\b Tutar = "+(tutar -  (tutar * 10 / 100)));
            }else if (yas > 65 ){
                System.out.println("yas indirimi uygulandı  yas => "+ yas + " " +"\b Tutar = " +(tutar -  (tutar * 20 / 100)));
            }else {
                System.out.println("yas indirimi uygulanmadı tutar = " + tutar);
            }
        }else
            System.out.println("hatalı işlem");

    }
}