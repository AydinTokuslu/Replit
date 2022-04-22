package ReplitSorular;

public class soru2_faktöriyel {
    public static void main(String[] args) {

        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

                Input : 6

        Output: 6!=65432*1=720
         */

        int input=6;
        int carpim=1;
        for (int i = 6; i > 1; i--) {
            //System.out.print(i+"x");
            carpim*=i;
        }
        //System.out.println("1="+carpim);
        System.out.println("6!=65432*1="+carpim);






    }
}
