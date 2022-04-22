package ReplitSorular;

import java.util.ArrayList;
import java.util.List;

public class soru20_list_enCokTekrarlananHarfiBulma {

    public static void main(String[] args) {

        /*
        Write a Java program to get a String from user as input and
        find the maximum occurring character in that string.
        (Ignore case sensitivity)
        input : Learning java is easy
        output: maximum occurring character is : a
         */

        String str="Learning java is easy";
        String arr[]=str.split("");
        String maximumOccurringCharacter="";
        int maxCount=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                maximumOccurringCharacter=arr[i];
            }else if (count==maxCount){
                maximumOccurringCharacter+=", "+arr[i];
            }
            count=0;
        }

        System.out.println(" maximum occurring character is : "+maximumOccurringCharacter);




    }



}
