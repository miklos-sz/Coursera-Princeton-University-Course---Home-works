/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     05/04/2020
 *  Program:           GreatCircle.java
 *  Description:       Calculates distance from two given points' coordinates
 *                     given as command line arguments.
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {

        // Declaring Eart's radius in variable

        double r = 6371.0;

        // Getting data from command-line arguments and assing them to variables

        double x1deg = Double.parseDouble(args[0]);
        double y1deg = Double.parseDouble(args[1]);
        double x2deg = Double.parseDouble(args[2]);
        double y2deg = Double.parseDouble(args[3]);

        // Converting degs to rads and assing them to new variables

        double x1 = Math.toRadians(x1deg);
        double y1 = Math.toRadians(y1deg);
        double x2 = Math.toRadians(x2deg);
        double y2 = Math.toRadians(y2deg);

        // Doing the math

        // Squaring x & y sines and assign them to variables in order to get a more transparent formula

        double xCoord = Math.pow(Math.sin((x2 - x1) / 2), 2.0);
        double yCoord = Math.pow(Math.sin((y2 - y1) / 2), 2.0);

        // The problem itself

        double distance = 2 * r * Math
                .asin((Math.sqrt(xCoord + Math.cos(x1) * Math.cos(x2) * yCoord)));

        // Printing out the result

        System.out.println(
                "The distance on the Great Circle between the two given point is " + distance
                        + " kilometers.");
    }
}
