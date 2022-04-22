package ReplitSorular;

public class soru14_array_averageNumber {
    public static void main(String[] args) {

        /*
        Write a java program that calculates the average value of array elements
        input[]= {1,2,3,4,5,6,7}
        Output : 4
         */

        Integer input[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;
        int ortalama = 0;
        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
            ortalama = toplam / input.length;
        }
        System.out.println(ortalama);


    }
}
