import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("" + "Ocak       :1 \n" + "Subat      :2\n" + "Mart       :3\n" + "Nisan      :4\n" + "Mayis      :5\n" + "Haziran    :6\n" + "Temmuz     :7\n" + "Agustos    :8\n" + "Eylul      :9\n" + "Ekim       :10\n" + "Kasim      :11\n" + "Aralik     :12\n");


        System.out.print("Hangi ayda dogdunuz : ");
        int hangi_ay = input.nextInt();

        System.out.print("Hangi Gun Dogdunuz : ");
        int hangi_gun = input.nextInt();

        boolean otuz_gun = (hangi_ay == 4 || hangi_ay == 6 || hangi_ay == 8 || hangi_ay == 10 || hangi_ay == 12) && (hangi_gun <= 30);
        boolean otuzbir_gun = (hangi_ay == 1 || hangi_ay == 3 || hangi_ay == 5 || hangi_ay == 7 || hangi_ay == 9 || hangi_ay == 11) && (hangi_gun <= 31);

        if (hangi_gun <= 31 && hangi_gun > 0) {
            //koc
            if (hangi_ay == 2 && hangi_gun > 28) {
                System.out.println("Subat ayi için yanlis deger (Eğer 1461 ihtimalden biri isen Bucun Balık :)) 29 Subat  )");

            } else if (otuz_gun || otuzbir_gun) {

                if ((hangi_ay == 3 && hangi_gun >= 21) || (hangi_ay == 4 && hangi_gun <= 20)) {
                    System.out.println("Burcunuz Koc");
                }
                //boga
                if ((hangi_ay == 4 && hangi_gun >= 21) || (hangi_ay == 5 && hangi_gun <= 21)) {
                    System.out.println("Burcunuz Boga");
                }
                if ((hangi_ay == 5 && hangi_gun >= 22) || (hangi_ay == 6 && hangi_gun <= 22)) {
                    System.out.println("Burcunuz ikizler ");
                }
                // yengec
                if ((hangi_ay == 6 && hangi_gun >= 23) || (hangi_ay == 7 && hangi_gun <= 22)) {
                    System.out.println("Burcunuz Yengec ");
                }
                //aslanS

                if ((hangi_ay == 7 && hangi_gun >= 23) || (hangi_ay == 8 && hangi_gun <= 22)) {
                    System.out.println("Aslan Koc");
                }
                if ((hangi_ay == 8 && hangi_gun > 23) || (hangi_ay == 9 && hangi_gun <= 22)) {
                    System.out.println("Burcunuz Basak");
                }
                if ((hangi_ay == 9 && hangi_gun >= 23) || (hangi_ay == 10 && hangi_gun <= 22)) {
                    System.out.println("Burcunuz Terazi");
                }
                if ((hangi_ay == 10 && hangi_gun >= 23) || (hangi_ay == 11 && hangi_gun <= 21)) {
                    System.out.println("Burcunuz Akrep");
                }
                //yay
                if ((hangi_ay == 11 && hangi_gun >= 22) || (hangi_ay == 12 && hangi_gun <= 21)) {
                    System.out.println("Burcunuz Yay");
                }
                if ((hangi_ay == 12 && hangi_gun >= 22) || (hangi_ay == 1 && hangi_gun <= 21)) {
                    System.out.println("Burcunuz Oglak");
                }
                if ((hangi_ay == 1 && hangi_gun >= 22) || (hangi_ay == 2 && hangi_gun <= 19)) {
                    System.out.println("Burcunuz Koc");
                }
                if ((hangi_ay == 2 && hangi_gun >= 20) || (hangi_ay == 3 && hangi_gun <= 20)) {
                    System.out.println("Burcunuz Koc");
                }
            } else {
                System.out.println("Gecerli tarih degil");
            }
        } else {
            System.out.println("Gecerli tarig degil");
        }


    }
}