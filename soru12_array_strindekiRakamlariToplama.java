package ReplitSorular;

public class soru12_array_strindekiRakamlariToplama {
    public static void main(String[] args) {

        /*
        Write a method which accepts a String as parameter
        and prints the sum of the digits, present in the given string.
        input : ade1r4d3
        output : 8

        Hint :
        Use Character.isDigit()
        Integer.valueOf()
         */

        String input = "ade1r4d312ddf";
        String str[]=input.split("");
        int toplam=0;
        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i].charAt(0))){
                toplam+=Integer.valueOf(str[i]);
            }
        }
        System.out.println(toplam);

    }
}
