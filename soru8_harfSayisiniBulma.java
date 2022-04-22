package ReplitSorular;

import java.util.Scanner;

public class soru8_harfSayisiniBulma {

    /*
    Ask user to enter a name and a character,
    then check how many times the character is repeated
    in the name using loops in the name
    e.g: char ch1= 'a' ;
    String name =“John came late"
    Expected Output: Number of a = 2
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        String ch1="a";

        int count=0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.substring(i,i+1).equals(ch1)) {
                count++;
            }
        }System.out.println("a harfi cümlede "+ count+" kere geçiyor.");

    }

}
