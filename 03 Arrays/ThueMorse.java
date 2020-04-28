/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     23/04/2020
 *  Program:           ThueMorse.java
 *  Description:       Visualizes Thue-Morse Weave in an 'n' matrix.
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int num = 0;
        int count = 0;
        while (num <= n) {
            num = (int) Math.pow(2, count);
            if (num == n) break;
            count++;
        }
        n = num;
        if (num <= 4) n = 4;

        boolean[] row = new boolean[n];
        row[0] = false;

        for (int colNo = 0; colNo < n; colNo++) {
            row[colNo] = row[colNo / 2];
            for (int swap = 0; swap < colNo; swap++) {
                if (!row[colNo]) row[colNo] = true;
                else {
                    row[colNo] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (row[j] != row[i]) {
                    System.out.print("-");
                }
                else {
                    System.out.print("+");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
