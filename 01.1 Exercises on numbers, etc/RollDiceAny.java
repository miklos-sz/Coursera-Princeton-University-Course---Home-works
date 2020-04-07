/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           RollDiceAny.java
 *  Description:       Rolls a user-given sided dice.
 **************************************************************************** */

import java.util.Scanner;

public class RollDiceAny {
    public static void main(String[] args) {

        // User can define the number of the sides of the dice via input a number by Scanner.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of sides of your dice to roll:");

        // Storing the user-given data in integer, and decalring that the smallest dice has at least one side.
        int maxSide = userInput.nextInt();
        int minSide = 1;

        // Using the Math.random() method, giving it a range to choose a number from.
        double roll = (Math.random() * (maxSide - minSide) + 1);

        // Rounding and printing out the result of this dice roll.
        System.out.println((Math.round(roll)));

    }
}
