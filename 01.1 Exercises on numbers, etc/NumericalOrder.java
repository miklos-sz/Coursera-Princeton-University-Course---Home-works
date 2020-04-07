/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           Numerical.Order.java
 *  Description:       Puts input 3 numbers into numerical order.
 **************************************************************************** */
public class NumericalOrder {
    public static void main(String[] args) {

        // Assing command line argument input numbers to integeres.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Declaring a temporary 'memory' integer to assing them numbers to exchange.
        int memNo;
        // Checking if 'b' has smaller value then'a'. If has, a goest to 'memNo' then
        // 'a' gets the value of 'b' and finally 'b' gets the value from memory variable 'memNo'.
        if (b < a) {
            memNo = a;
            a = b;
            b = memNo;
        }
        // Checking if 'c' is smaller then 'a', rest is same as above.
        if (c < a) {
            memNo = a;
            a = c;
            c = memNo;
        }
        // Checking if 'c' is maller then 'b', rest is same as above.
        if (c < b) {
            memNo = b;
            b = c;
            c = memNo;
        }

        // Printing out numbers in ascending numerical order.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
