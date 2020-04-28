/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     25/04/2020
 *  Program:           BirthdayTwo.java
 *  Description:       A version of birthday problem.
 *                     It takes 'n' number of people with random birthdays
 *                     within a leap year. As people keep entering the room,
 *                     the program finds out which newly entering person
 *                     shares birthday with someone who's already in the room.
 **************************************************************************** */

public class BirthdayTwo {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);      // Number of people entered the room
       /* int trials = Integer.parseInt(args[1]); // Number of trials to run
        int[] people = new int[n + 2];  // Array to count how many people was involved altogether*/

        int[] bDay = new int[n];        // Array to store the individual persons' birthdays

        int ranDom;     // To count a random birthday
        int personNo;   // Cycle variable for populating bDay[] arrays

        for (personNo = 0; personNo < n; personNo++) {      // Populating bDay[] arrays
            bDay[personNo] = (int) (Math.random() * 366);
            // System.out.print(personNo + ". " + bDay[personNo] + " | ");
        }
        // System.out.println(System.lineSeparator());
        int match = 0;
        int entered = 1;
        int check = 0;
        while (entered < n) {
            // System.out.println("entered = " + entered);
            while (check < entered) {
                // System.out.println("check = " + check);
                for (int i = 0; i <= check; i++) {
                    // System.out.println("i = " + i);
                    if (bDay[entered] == bDay[i]) {
                        match = entered;
                        break;
                    }
                }
                if (match == entered) break;
                check++;
            }
            if (match == entered) break;
            entered++;
        }
        if (match == 0) System.out.println("There was no match.");
        else {
            System.out.println("Match: after the " + match + ". guy entered the room.");
        }
    }
}
