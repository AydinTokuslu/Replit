package ReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru21_list_swapElements {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.
    INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
    Output: [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
    public static void main(String[] args) {

        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> list=new ArrayList<String>(Arrays.asList(names));
        System.out.println(list);

        swapElements(list);

    }

    private static void swapElements(List<String> list) {

        String name=list.get(7);
        //System.out.println(name);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Kemal")){
                list.set(7, "Kemal");
            }
        }
        list.set(2,name);
        System.out.println(list);

    }
}
