import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        int total = 0;
        int counter = 0;
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total+=i;
                counter++;
            }
        }
        System.out.println("-------------------");
        System.out.println("TOTAL : " + total/counter);
    }
}