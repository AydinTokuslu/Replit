package ReplitSorular;

import java.util.ArrayList;

public class soru25_enCokTekrarlananHarf {

    /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {

        String str="Javaisalsoeasy";
        char[] arr =str.toCharArray();//her bir karakteri bir arraye dönüştürüyor.
        ArrayList<Character> output=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j] && !output.contains(arr[j])){
                    output.add(arr[j]);
                }
            }
        }
        System.out.println("output : "+ output);


    }
}
