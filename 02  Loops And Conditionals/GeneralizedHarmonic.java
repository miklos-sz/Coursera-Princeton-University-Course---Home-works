/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     12/04/2020
 *  Program:           GeneralizedHarmonic.java
 *  Description:       Calculates the n-th harmonic by parameters 'n' and 'r'.
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double result = 0.0;

        if (n <= 0) System.out.println("Sorry, but 'n' must be a positive integer.");
        else {

            for (int i = 1; i <= n; i++) {

                double math = Math.pow(i, r);
                result = result + 1.0 / math;

            }

            System.out.println(result);
        }

    }
}
