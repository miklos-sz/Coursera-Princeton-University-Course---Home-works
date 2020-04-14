/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     11/04/2020
 *  Program:           PowersOfTwoFor.java
 *  Description:       Calculates and prints out the power squares of 2, using 'for'.
 **************************************************************************** */

public class PowersOfTwoFor {
    public static void main(String[] args) {

        int num = 2; // Our number to power.
        int n = 12; // The maximum number of squares we mant to compute.

        // 'for' loop to repeat the math
        for (int i = 0; i <= n; i++) {

            // Prints out number of cycle (iteration) assigned to integer 'i'
            // and prints out the initial value at first, then it's ascending, since we increment
            // the iterations by 1 (i++) until it reaches 12 ('int n')
            // then it tells the actual value of 'num' ( which is initially 0, and its maximum is 2^n).
            System.out.println(i + " " + num);

            // The math: we multiply 2 (power) with 'num' (initilally 2)
            // and assing the value of the math to the integer 'num' itself.
            num = 2 * num;

        }
    }
}
