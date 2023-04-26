import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("karsi kenar :");
        int karsi_kenar = input.nextInt();


        System.out.print("komsu kenar  :");
        int komsu_kenar = input.nextInt();

        double hipotenus = Math.sqrt(Math.pow(karsi_kenar, 2) + Math.pow(komsu_kenar, 2));

        double u = (karsi_kenar + komsu_kenar + hipotenus) / 2;

        double heron_formulu = Math.sqrt((u * (u - karsi_kenar) * (u - komsu_kenar) * (u - hipotenus)));

        System.out.println("Uckenin alani : " + heron_formulu);
        System.out.println("hipotenus : " + hipotenus);
        System.out.println("yarim cevre : " + u);
    }
}