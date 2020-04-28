/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Email:             szilas.miklos@gmail.com
 *  Last modified:     23/04/2020
 *  Program:           SquareTwo.java
 *  Description:
 **************************************************************************** */

public class SquareTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int num = 0;

        int i = 0;
        while (num <= n) {
            num = (int) Math.pow(2, i);
            if (num == n) break;
            System.out.println("i = " + i);
            System.out.println("num = " + num);
            i++;
        }
        if (n <= 4) num = 4;
        n = num;
        System.out.println("n = " + n);
    }
}
