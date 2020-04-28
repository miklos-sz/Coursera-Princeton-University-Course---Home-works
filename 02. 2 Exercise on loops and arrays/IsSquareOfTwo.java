/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     21/04/2020
 *  Program:           LoopTest.java
 *  Description:       We need a number that is a square of 2, but at least it
 *                     is its 2nd square. If input number 'n' is not a square
 *                     of 2, we'll make it to be the next square of two.
 **************************************************************************** */

public class IsSquareOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int num = n;
        int exp = 2;
        boolean isSquareOfTwo = false;

        while (num % 2 == 0 && num > 2) {
            num = num / 2;
            if ((int) Math.pow(2, exp) == n) {
                isSquareOfTwo = true;
                System.out.println("Ok, we can use " + n + " for our computations tho!");
            }
            exp++;
        }
        if (!isSquareOfTwo) {
            int newN;
            for (newN = 4; newN < n; newN = newN * 2) {
            }
            System.out.println(
                    "Fine, but we'd rather use our new 'n = " + newN
                            + "' for our computations, instead of original 'n = " + n
                            + "' tho!");
        }
    }
}
