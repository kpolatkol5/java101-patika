import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("dairenin capi : ");
        int cap = input.nextInt();

        System.out.print("aci degeri : ");
        int aci = input.nextInt();

        float pi = 3.14f;


        System.out.println("dairenin alani : "+(pi * (cap*cap)) );

        System.out.println("dairenin cevresi  : "+(pi*2*cap) );
        System.out.println("istenilen acinin alani : " +(( pi * (cap*cap) * aci) /360))  ;
    }
}