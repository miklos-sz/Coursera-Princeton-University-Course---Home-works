/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     06/04/2020
 *  Program:           RightTriangle.java
 *  Description:       Decides whether a triangle is a right triangle or not,
 *                     according to the system line argument data that represent
 *                     the triangle's sides lengths.
 **************************************************************************** */

public class RightTriangle {

    public static void main(String[] args) {

        // Decalring integers for input data

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Declaring a boolean for result

        boolean result;

        // Checking if a, b, c are positive numbers then doing floating point comparison on the Pythagorean Theorem

        result = (a > 0) && (b > 0) && (c > 0) && (Math.abs(c * c - (a * a + b * b)) < 0.0001);

        System.out.println(result);
    }
}
