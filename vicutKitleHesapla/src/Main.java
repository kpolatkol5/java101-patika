import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kilonuzu giriniz : ");
        int kilo = input.nextInt();

        System.out.print("boyunuzu giriniz (m) : ");
        float  boy = input.nextFloat() ;


        System.out.println("Vicut kitle indeksi : "+(kilo / (boy*boy)));
    }
}