import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,i = 1,toplam = 0;

        do {

            System.out.print("SAYI GİRİNİZ : ");
            sayi = input.nextInt();

            for (i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi + " bir mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " bir mükemmel sayı değildir.");
            }

        }while (sayi > 0);{
            System.out.print("HATALI GİRİŞ !");

        }




    }
}