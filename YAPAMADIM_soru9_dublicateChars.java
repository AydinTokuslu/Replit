package ReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YAPAMADIM_soru9_dublicateChars {
    public static void main(String[] args) {

        /*
        Write a code that returns the duplicate chars
        in a String array.(interview Question)
        Input : String str=“Javaisalsoeasy”
        Output: [a, s]
         */
        String str="Javaisalsoeasy";
        String yeniStr[]=str.split("");
        System.out.println(Arrays.toString(yeniStr));
        int count=0;
        List<String> harfler=new ArrayList<String>();
        for (int i = 0; i < yeniStr.length; i++) {
            for (int j = 1; j < yeniStr.length; j++) {
                if (yeniStr[i].equals(yeniStr[j]) && !harfler.contains(yeniStr[j])){
                    harfler.add(yeniStr[i]);
                    count++;
                }
            }count=0;

        }System.out.println(harfler+ " harfinin sayısı : "+count);



    }
}
