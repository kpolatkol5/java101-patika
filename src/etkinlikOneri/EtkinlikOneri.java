package etkinlikOneri;
import  java.util.Scanner;


public class EtkinlikOneri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Sicaklik degerini giriniz : ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsin");
        } else if (sicaklik>=5 && sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsin");

        } else if (sicaklik>=15 && sicaklik<25) {
            System.out.println("piknik yapabilirsin");

        } else if (sicaklik>=25) {
            System.out.println("yüzebilirsin");
        }
    }
}
