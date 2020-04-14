/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           SquareRootOfTwo.java
 *  Description:       Calculates and prints out the square root of 2 until 7 places.
 **************************************************************************** */

public class SquareRootOfTwo {
    public static void main(String[] args) {

        double EPS = 1E-15;
        double c = Double.parseDouble(args[0]);
        double t = c;

        while (Math.abs(t - c / t) > t * EPS)
            t = (c / t + t) / 2.0;

        System.out.println(t);

    }
}
