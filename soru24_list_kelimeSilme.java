package ReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru24_list_kelimeSilme {

    /*
    Write a program that deletes the letters 'a' from
    the names in the list given as input.
       INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
       OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> list2 = new ArrayList<>();
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).toLowerCase().contains("a")){
                list2.add(list1.get(i));

            }
        }
        System.out.println(list2);

    }
}
