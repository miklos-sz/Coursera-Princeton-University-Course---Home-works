/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     10/04/2020
 *  Program:           ThinkANumber.java
 *  Description:
 **************************************************************************** */

import java.util.Scanner;

public class ThinkANumber {
    public static void main(String[] args) {

        double randomOszto = Math.round((Math.random() * (10 - 1) + 1));
        int x = (int) randomOszto;

        double randTobbszoros = Math.round((Math.random() * (10 - 1) + 1));
        int multiplier = (int) randTobbszoros;

        int y = x * multiplier;
        int z = y / x;

        Scanner userInput = new Scanner(System.in);
        System.out.println("I show you a calculation, that always provides " + z
                                   + " as a result.");
        System.out.println("It works with any number of your choice between 1 and 10.");
        System.out.println("(Type your number here:)");

        int n = userInput.nextInt();

        int result = (n * x + y) / x - n;

        int step1 = n * x;
        int step2 = step1 + y;
        int step3 = step2 / z;

        System.out.println(n + " * " + x + " = " + step1);
        System.out.println(step1 + " + " + y + " = " + step2);
        System.out.println(step2 + " / " + z + " = " + step3);
        System.out.println(step3 + " - " + n + " = " + result);

        System.out.println(result);

        System.out.println(
                "(" + n + " * " + x + " + " + y + ")" + " / " + z + " - " + n
                        + " = " + z);


    }
}
