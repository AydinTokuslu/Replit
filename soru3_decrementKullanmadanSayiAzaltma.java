package ReplitSorular;

public class soru3_decrementKullanmadanSayiAzaltma {

    public static void main(String[] args) {

    /*
    100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

    OUTPUT : 100 98 96 94 92 … … … … 2 0
     */
        int i=100;
        do {
            System.out.print(i+" ");
            i-=2;
        }while (i>=0);




    }


}
