/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           RollDice6.java
 *  Description:       Rolls a six-sided dice.
 **************************************************************************** */

public class RollDice6 {
    public static void main(String[] args) {

        // Generating a random number in a certain range.
        // * (maximum - minimum) + minimum (otherwise it'd be counting from zero.
        double random = (Math.random() * (6 - 1) + 1);

        // Rounding the result of Math.random(), casting it form double to integer.
        int roll = (int) Math.round(random);
        // Printing aout the result.
        System.out.println(roll);
    }
}
