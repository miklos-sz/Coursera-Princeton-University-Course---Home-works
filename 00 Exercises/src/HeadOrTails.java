/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           HeadOrTails.java
 *  Description:       Flips a coin to help you to decide. Classic Head or Tails.
 **************************************************************************** */

public class HeadOrTails {

    public static void main(String[] args) {

        // random method generates a number between 0.0 and 0.9999. We cut it half.

        if (Math.random() < 0.5) {

            System.out.println("Head");

        } else System.out.println("Tails");

    }
}
