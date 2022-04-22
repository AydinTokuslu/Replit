package ReplitSorular;

import java.util.ArrayList;
import java.util.List;

public class soru1_forwhile_enCokTekrarlananHarfBulma_ikinciDeneme {
    public static void main(String[] args) {
        /*
    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

    Input :

    String str=“Javaisalsoeasy”

    Output: a s
     */


            String str="Javaisalsoeasy";
            String arr[]=str.split("");
            List<String> enCokTekrarEden=new ArrayList<String>();
            int sayac=0;
            int maxSayac = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equalsIgnoreCase(arr[j])) {
                        sayac++;

                    }

                }

                if (sayac > maxSayac) {
                    maxSayac = sayac;
                    enCokTekrarEden.add(arr[i]);
                }
               sayac = 0;

            }System.out.println(" metinde encok bulunan harf : "+enCokTekrarEden);


    }
}
