/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     13/04/2020
 *  Program:           CheckIt
 *  Description:
 **************************************************************************** */

public class CheckIt {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 4;
        if (a < b) {
            if (b < c) {
                if (c < a) System.out.println(a + " " + b + " " + c);
                else System.out.println(c + " " + b + " " + a);
            }
            else System.out.println(a + " " + c + " " + b);
        }
        else System.out.println(b + " " + a + " " + c);
    }

}
