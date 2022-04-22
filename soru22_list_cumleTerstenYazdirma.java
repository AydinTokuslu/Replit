package ReplitSorular;

import java.util.Arrays;
import java.util.Scanner;

public class soru22_list_cumleTerstenYazdirma {
    /*
    Get a sentence from the user. Accept the sentence received
    from the user as a parameter, Invert sentence using Array and
    write a Method that returns the result as a String to the main method.
    Note: Upper and lower case letters, spaces and
    special characters will not be changed.
    Input : It is very nice to write code.
    Output : .edoc etirw ot ecin yrev si tI
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        String arr[]=cumle.split("");
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + "");
        }

    }


}
