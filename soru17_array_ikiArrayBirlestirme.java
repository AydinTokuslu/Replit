package ReplitSorular;

import java.util.Arrays;

public class soru17_array_ikiArrayBirlestirme {
    public static void main(String[] args) {

        /*
        Write a return method that accepts 2 integer Arrays as parameters
        and adds 2 array into a new Array and prints it.
        Input1={1,2,3,4}
        Input2={5,6}
                Output={1,2,3,4,5,6}
         */

       int input1[]={1,2,3,4};
       int input2[]={5,6};
       int ortakArray[]=new int[input1.length+ input2.length];
        for (int i = 0; i < ortakArray.length; i++) {
            if (i<input1.length){
                ortakArray[i]=input1[i];
            }else {
                ortakArray[i]=input2[i-input1.length];
            }
        }


        System.out.println(Arrays.toString(ortakArray));

    }
}
