import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik;


        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + muzik) / 5;

        if ((mat > 0 && mat < 100) && (fizik > 0 && fizik < 100) && (kimya > 0 && kimya < 100) && (turkce > 0 && turkce < 100) && (muzik > 0 && muzik < 100)) {

            if (ortalama >= 55) {
                System.out.println("Tebrikler sinifi gectiniz  ortalamaniz : " + ortalama);
            } else {
                System.out.println("Sinifi gecemediz :(  ortalamaniz : " + ortalama);

            }
        } else {
            System.out.println("Geçersiz not girdiniz lütfen notları 0 ile 100 arasında giriniz ");
        }
    }
}