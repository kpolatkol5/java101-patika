import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum yılınızı giriniz : ");
        int dogumYili = input.nextInt();

        if (dogumYili %12 == 0)
            System.out.println("burcunuz :Maymun ");
        else if (dogumYili %12 == 1)
            System.out.println("burcunuz :Horoz ");

        else if (dogumYili %12 == 2)
            System.out.println("burcunuz :köpek ");

        else if (dogumYili %12 == 3)
            System.out.println("burcunuz :domuz ");

        else if (dogumYili %12 == 4)
            System.out.println("burcunuz :Fare");

        else if (dogumYili %12 == 5)
            System.out.println("burcunuz :öküz ");

        else if (dogumYili %12 == 6)
            System.out.println("burcunuz :Kaplan ");

        else if (dogumYili %12 == 7)
            System.out.println("burcunuz :tavsan ");

        else if (dogumYili %12 == 8)
            System.out.println("burcunuz :ejderha ");

        else if (dogumYili %12 == 9)
            System.out.println("burcunuz :Yılan ");

        else if (dogumYili %12 == 10)
            System.out.println("burcunuz :at ");

        else if (dogumYili %12 == 11)
            System.out.println("burcunuz :koyun ");
        else
            System.out.println("hatalı işlem");
   }
}