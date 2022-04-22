package ReplitSorular;

public class soru11_array_cumleyiTerstenYazdirma {
    public static void main(String[] args) {

        /*
        Write a Java program that reverse a sentence by using Array
        (with all spaces and special characters).
        Input : Coding is greate.
        Output : .etaerg si gnidoC
         */
        String input = "Coding is greate.";
        String output []=input.split("");

        for (int i = input.length()-1; i >= 0; i--) {
            System.out.print(output[i] + "");
        }


    }
}
