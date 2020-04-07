/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           Dice6.java
 *  Description:       Rolls a six-sided dice.
 **************************************************************************** */


public class Dice6 {

    public static void main(String[] args) {

        // Declaring minimum and maximum values of the sides of the dice
        int minSide = 1;
        int maxSide = 6;

        // Generating random number between 1 and 6
        double random = (Math.random() * (maxSide - minSide)) + minSide;

        // Storing and casting result to an integer (from double)
        int roll = (int) Math.round(random);

        // It just simply prints out the result.
        System.out.println("You've rolled a good " + roll + ".");
    }
}
