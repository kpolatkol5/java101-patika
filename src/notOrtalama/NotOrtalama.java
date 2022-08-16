package notOrtalama;
import java.util.Scanner;


public class NotOrtalama{
    public static void main(String[] args) {

        int mat , fizik, kimya , turkce , muzik , tarih;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuz :");
        mat = input.nextInt();

        System.out.println("***********************************************");

        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("***********************************************");

        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("***********************************************");

        System.out.print("muzik notunuz: ");
        muzik = input.nextInt();
        System.out.println("***********************************************");

        System.out.print("turkce notunuz: ");
        turkce = input.nextInt();
        System.out.println("***********************************************");

        System.out.print("tarih notunuz: ");
        tarih = input.nextInt();
        System.out.println("***********************************************");

        double result = (mat+ fizik+ kimya+muzik+turkce+tarih) / 6 ;

        System.out.println("ortalama : " + result + "\n durum : "+  (result > 60 ? "gecti " : "kaldi"));

    }
}