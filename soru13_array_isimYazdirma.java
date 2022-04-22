package ReplitSorular;

import java.util.Arrays;
import java.util.Scanner;

public class soru13_array_isimYazdirma {
    public static void main(String[] args) {

        /*
        Create a custom return type method accepts a name as parameter
        and prints the name as a char array.
        (do not use toCharArray() method)
        Input : John
        Output :[J, o, h, n]
         */

        String name="John";
        nameMethod(name);


    }

    public static void nameMethod(String name) {

        String nameArr[]=name.split("");
        System.out.println(Arrays.toString(nameArr));
    }
}
