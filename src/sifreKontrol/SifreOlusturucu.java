package sifreKontrol;
import java.util.Scanner;

public class SifreOlusturucu {
    public static void main(String[] args) {

        String   password     =   "Java" , user_name    =   "kadir" ;

        Scanner input = new Scanner(System.in);


        System.out.print("kullanici adiniz : ");
        String user_name_sor = input.nextLine();

        System.out.print("Parolanizi giriniz : ");
        String parola_sor = input.nextLine();


        if (user_name.equals(user_name_sor) && parola_sor.equals(password) ){
            System.out.println("Giris başarili hosgeldiniz");
        }
        else{

            if (user_name.equals(user_name_sor) ){
                System.out.print("Parolanizi yanlis girdiniz sifirlamak ister misiniz ?  (y / herhangi bir tus) ");
                String sifirlansin_mi = input.nextLine();

                if (sifirlansin_mi.equals("y")){
                    System.out.print("Yeni Sifrenizi giriniz :  ");
                    String yeni_sifre = input.nextLine();

                    if (yeni_sifre.equals(password)) {
                        System.out.println("sifre olusturulamadi zaten eski sifrenle ayni :))");
                        // eski sifre ile yeni sifre ayni ise sistemden çıklıcaktır. Bu kisim döngü ile saglanabilir henüz donguler islenmedigi icin bu sekilde yapildi
                    }
                    else {
                        System.out.println("Sifre olusturma basarili iyi gunler...");

                    }
                }
                else {
                    System.out.println("Gorusuruz : ");
                }
            }
            else {
                    System.out.println("Kullanici adinizi yanlis girdiniz lütfen tekrar denyiniz :");
            }
        }

    }
}
