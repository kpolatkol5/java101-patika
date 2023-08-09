import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl : ");
        int yil = input.nextInt();
        if (yil % 4 == 0 ){
            System.out.println(yil + " artık yıldır..." );
        }else {
            System.out.println(yil + " artık yıldır değildir..." );

        }
    }
}