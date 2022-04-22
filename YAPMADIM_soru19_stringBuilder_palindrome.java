package ReplitSorular;

public class YAPMADIM_soru19_stringBuilder_palindrome {
    public static void main(String[] args) {

        /*
        Write a java program which accept a sentence as parameter,
        than reverses sentence by using StringBuilder
        and checks if sentence is palindrome or not (without case sensitivity)
        Eg : input : I love Java Output: "Reversed sentence : avaJ evol I .
        It is not a palindrome"
         */


        StringBuilder string=new StringBuilder("kedi");
        //string.reverse();
        System.out.println("reversed sentence : "+string);
        //System.out.println(string.toString());

        if (!string.equals(string.reverse())){
            System.out.println("It is not a palindrome");
        }else{
            System.out.println("It is a palindrome");
        }


    }
}
