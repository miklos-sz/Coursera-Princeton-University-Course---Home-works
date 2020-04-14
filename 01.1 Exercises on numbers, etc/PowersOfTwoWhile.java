/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     07/04/2020
 *  Program:           PowersOfTwoWhile.java
 *  Description:       Calculates and prints out the power squares of 2, using 'while'.
 **************************************************************************** */

public class PowersOfTwoWhile {
    public static void main(String[] args) {

        int num = 2;
        int n = 12;
        int i = 0;

        while (i <= n) {

            System.out.println(i + " " + num);

            i++;
            num = 2 * num;

        }

    }
}
