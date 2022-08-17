package manavKasa;
import java.util.Scanner;


public class Manav_kasa_hesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5.00f;

        System.out.print("kac kilo armut : ");
        float armut_kac     = input.nextFloat();

        System.out.println("********************");

        System.out.print("kac kilo elma : ");
        float elma_kac      = input.nextFloat();

        System.out.println("********************");

        System.out.print("kac kilo domates : ");
        float domates_kac   = input.nextFloat();

        System.out.println("********************");

        System.out.print("kac kilo muz : ");
        float muz_kac       = input.nextFloat();

        System.out.println("********************");

        System.out.print("kac kilo patlican : ");
        float patlican_kac  = input.nextFloat();

            double result = (armut_kac*armut) + (elma+elma_kac) + (domates*domates_kac) + (muz_kac*muz_kac)+(patlican_kac*patlican);

            System.out.println("Sepet Tutari : " + result);


    }

}
