package ReplitSorular;

import java.util.Scanner;

public class soru5_mükemmelSayiyiBulma {
    public static void main(String[] args) {

        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

        Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
        Input : 6
        Output: 6 Mukemmel Sayidir.
        ======================
        Input : 7
        Output: 7 Mukemmel Sayidir degildir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int sayi= scan.nextInt();

        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if (sayi==toplam){
            System.out.println("girdiğiniz sayı mükemmel sayıdır.");
        }else System.out.println("girdiğiniz sayı mükemmel sayı değildir");


    }
}
