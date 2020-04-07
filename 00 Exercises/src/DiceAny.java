/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           DiceAny.java
 *  Description:       Rolls a dice with any sides the user inputs.
 **************************************************************************** */

import java.util.Scanner;

public class DiceAny {

    public static void main(String[] args) {

        // Calls a new Scanner input instance
        Scanner inputSides = new Scanner(System.in);
        System.out.println("Enter the sides of the dice to roll with:");

        // Gets the maximum number of dice's sides from the input and assigns it to an integer
        int sidesMax = inputSides.nextInt();

        // We have to give the minimum number of the sides/return values
        int sidesMin = 1;

        // Generating random number - this formula allows us to locate the result between min and max values
        double random = (Math.random() * (sidesMax - sidesMin)) + sidesMin;

        // Declares an int to hold the value and cast it from double to int AND rounds it to whole number
        int roll = (int) Math.round(random);

        // Prints out result
        System.out.println("Your roll is: " + roll);
    }
}
