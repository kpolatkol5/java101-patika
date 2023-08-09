import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int total = 0;

        do {
            System.out.print("bir sayi giriniz : ");
            sayi = input.nextInt();

            if (sayi % 4 == 0) {
                total += sayi;
                System.out.println(sayi);
            }
        } while (sayi % 2 == 0);
        System.out.println("toplam " + total);
    }
}