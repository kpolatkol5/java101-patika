import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi_1 , sayi_2 ,sayi_3;


        System.out.print("ilk sayi : ");
        sayi_1 = input.nextInt();

        System.out.print("ikinci sayi : ");
        sayi_2 = input.nextInt();

        System.out.print("son sayi : ");
        sayi_3 = input.nextInt();

        if ((sayi_1 < sayi_2)&& (sayi_1<sayi_3)){
            //en kücük sayi_1 dir
            if (sayi_2<sayi_3){
                //sayi_2 kucuktur sayi_3 den
                System.out.println("sayi siralamasi : " + sayi_1+"<"+ sayi_2+"<"+ sayi_3);
            }else {
                System.out.println("sayi siralamasi : " + sayi_1+"<"+sayi_3 +"<"+sayi_2 );

            }
        }else if ((sayi_2<sayi_1)&& (sayi_2<sayi_3)){
            //en kucuk sayi 2 dir

            if (sayi_3<sayi_1){
                System.out.println("sayi siralamasi : " + sayi_2+"<"+sayi_3 +"<"+sayi_1 );
            }else {
                System.out.println("sayi siralamasi : " + sayi_2+"<"+sayi_1 +"<"+sayi_3 );

            }
        } else if ((sayi_3<sayi_1)&& (sayi_3<sayi_2)) {
            //en kucuk sayi 3 tur
            if (sayi_2<sayi_1){
                System.out.println("sayi siralamasi : " + sayi_3+"<"+sayi_2 +"<"+sayi_1 );

            }else {
                System.out.println("sayi siralamasi : " + sayi_3+"<"+sayi_1 +"<"+sayi_2 );
            }
        }
    }
}