/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           HeadsOrTails.java
 *  Description:       Helps to decide, flips up a penny, using Math.random().
 **************************************************************************** */

public class HeadsOrTails {
    public static void main(String[] args) {

        /* If the generated random number (by default from 0.0-0.99999)
           is in the lower 50% of the default range,
           then we call it 'heads', otherwise it will be 'tails'.*/

        if (Math.random() < 0.5) System.out.println("HEADS");
        else System.out.println("TAILS");

    }
}
