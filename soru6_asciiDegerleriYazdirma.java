package ReplitSorular;

public class soru6_asciiDegerleriYazdirma {
    public static void main(String[] args) {

        /*
        'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.

        Ascii value of a = 97
        Ascii value of b = 98
        .
        .
        Ascii value of y = 121
        Ascii value of z = 122
         */

        for (char i = 'a'; i <= 'z'; i++) {
            int ascii = i;
            System.out.println("Ascii value of "+i+" = "+ ascii);
        }


    }
}
