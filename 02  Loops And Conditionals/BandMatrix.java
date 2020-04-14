/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     13/04/2020
 *  Program:           BandMatrix.java
 *  Description:       Generates a band matrix.
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        // Number of lines / cloumns, width of diagonal.
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        // Checks if the input parameters are non-negative numbers.
        if (((n >= 0)) && ((width >= 0))) {
            // Line loop
            for (int line = 0; line < n; line++) {
                // Column loop
                for (int column = 0; column < n; column++) {
                    // If-else for printing out '*', '0', or 'space space'
                    // This conditional is the core of the whole code:
                    if (((line - column <= width && line - column >= 0) || (column - line <= width
                            && column - line >= 0))) {
                        System.out.print("*"); // Prints out asterisk...
                    }
                    else {
                        System.out.print("0"); // ...or zero,
                    }
                    if (column < n) {
                        System.out.print("  "); // then double spaces.
                    }
                }
                System.out.print(System.lineSeparator()); // Prints out a line break.
            }
        }
    }
}

