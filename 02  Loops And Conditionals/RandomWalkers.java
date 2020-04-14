/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     12/04/2020
 *  Program:           RandomWalkers.java
 *  Description:       Computes the average number of steps to get to a point,
 *                     which is 'r' Manhattan distance from the origin.
 *                     Runs the simulation 'trials' times.
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);      // Maximum Manhattan distance from origin
        int trials = Integer.parseInt(args[1]); // Number of times the simulations should run

        int x = 0;
        int y = 0;

        double steps = 0.0;

        for (int i = 0; i < trials; i++) {
            // every time we begin a trial we start from the origin (0, 0)
            x = 0;
            y = 0;

            // steps = 0 - no we DO NOT zero the steps out, let that cumulate
            // over every trial so we can get the average of all trials this way

            while ((Math.abs(x) + Math.abs(y)) < r) {

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

                steps++;

            }
        }

        System.out.println("average number of steps = " + steps / trials);
    }
}
