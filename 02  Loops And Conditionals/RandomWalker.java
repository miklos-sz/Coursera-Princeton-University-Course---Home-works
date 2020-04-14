/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     12/04/2020
 *  Program:           RandomWalker.java
 *  Description:       Computes the number of steps necessary to get to a point
 *                     which is 'r' Manhattan distance from the origin.
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);      // Maximum Manhattan distance from origin
        int x = 0;
        int y = 0;
        int steps = 0;

        if (r <= 0) System.out.println("(" + x + ", " + y + ")");
        else {
            while ((Math.abs(x) + Math.abs(y)) < r) {

                // Initial point - we print out, but it does not count into steps.
                if (steps < 1) System.out.println("(" + x + ", " + y + ")");

                /* Generating a random double, by default it's between 0 and 1.0.
                 *  It's North, if the random is below 0.25          (y += 1)
                 *  It's South, if the random is between 0.25 - 0.50 (y += -1)
                 *  It's West, if the random is between 0.50 - 0.75  (x += 1)
                 *  It's East, if the random is above 0.75           (x += -1)*/

                double randDouble = Math.random(); // Generates random double.

                if (randDouble < 0.25) y += 1;
                if (randDouble > 0.25 && randDouble < 0.50) y += -1;
                if (randDouble > 0.50 && randDouble < 0.75) x += 1;
                if (randDouble > 0.75) x += -1;

                steps++; // Increments number of steps.

                System.out.println("(" + x + ", " + y + ")");
            }
        }

        System.out.println("steps = " + steps);
    }
}
