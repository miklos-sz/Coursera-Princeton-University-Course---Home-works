/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     05/04/2020
 *  Program:           HelloGoodbye.java
 *  Description:       Gets two names from command line as arguments, and says
 *                     hello to them, then goodbye, in a reverse order.
 **************************************************************************** */

public class HelloGoodbye {

    public static void main(String[] args) {

        System.out.println("Hello " + args[0] + " and " + args[1] + ".");
        System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");

    }
}
