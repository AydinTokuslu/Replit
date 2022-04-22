package ReplitSorular;

public class soru15_array_minMaxNumbers {
    public static void main(String[] args) {

        /*
        Write a method that accepts an integer array as input and
        prints the minimum and the maximum numbers from given array
        Input : {3,2,5,4,1,6}
        Output : min: 1 max: 6
         */

        int input[] = {3,2,5,4,1,6};
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < min){
                min=input[i];
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max){
                max=input[i];
            }
        }

        System.out.println("min : "+ min+ " max : "+ max);

    }
}
