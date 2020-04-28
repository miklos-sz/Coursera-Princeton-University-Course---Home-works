/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     23/04/2020
 *  Program:           XmasTree.java
 *  Description:       A command-line argument input program, requires an
 *                     integer number 'n' to draw xmas tree within 'n' rows.
 **************************************************************************** */

public class XmasTree {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int row = 0;
        while (row < n) {   // A fancy loop to print the rows
            int i;
            for (i = n - 1; i - row > 0; i--) {     // Leading spaces
                System.out.print(" ");
            }
            for (int j = 0; j < row + 1 + i; j++) { // "o" characters printout
                System.out.print("o");
            }
            for (int k = n - 1; k - row > 0; k--) { // Trailing spaces
                System.out.print(" ");
            }
            System.out.print(System.lineSeparator()); // Makes a new line
            row++;
        }
    }
}
