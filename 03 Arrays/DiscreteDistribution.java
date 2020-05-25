/* *****************************************************************************
 *  Name:              Miklos Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     19/04/2020
 *  Program:           DiscreteDistribution.java
 *  Description:       Processes discrete distribution
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);      // First input element - no. of values to return.
        int[] a = new int[args.length];         // The rest of the input elements -> we'll use them
        int[] s = new int[args.length];         // The 0th element of cummulated sums of a[].
        int cummSum = 0;

        for (int i = 1; i < args.length; i++) { // Assigning input values to int a[1]...[n].
            a[i] = Integer.parseInt(args[i]);
            cummSum += a[i]; // cummulated sum is going to be the value of a[i]
            s[i] = cummSum;
        }

        int j;
        int r;

        for (int k = 0; k < m; k++) {
            r = (int) (Math.random() * (s[args.length - 1]) - 0);
            j = 0;
            while (j < s.length - 1 && !(s[j] <= r && r < s[j + 1])) {
                j++;
            }
            System.out.print(j + " ");
        }
    }
}
