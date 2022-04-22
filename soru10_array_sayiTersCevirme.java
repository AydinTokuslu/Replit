package ReplitSorular;

import java.util.Arrays;

public class soru10_array_sayiTersCevirme {
    public static void main(String[] args) {

        /*
        Write a return method to reverse number.
        Input : 12345
        Output : 54321
         */

        String sayi="12345";
        String yeniSayi[]=sayi.split("");

        for (int i = yeniSayi.length-1; i >= 0; i--) {
            System.out.print(yeniSayi[i]+"");
        }
        System.out.println("");

        //veya
        int sayi2[]= {1,2,3,4,5};

        sayi2=terstensirala(sayi2);
        System.out.println(Arrays.toString(sayi2));
    }

    private static int[] terstensirala(int[] sayi2) {
        int temp[]=new int[sayi2.length];// sayi2 uzunlugunda yeni bir array olusturdum.
        for (int i = 0; i < temp.length; i++) {
            temp[i]=sayi2[sayi2.length-1-i];

        }return temp;
    }
}
