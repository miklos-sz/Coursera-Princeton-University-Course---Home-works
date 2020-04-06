/* *****************************************************************************
 *  Name:              Miklós Szilas
 *  Coursera User ID:  szilas.miklos@gmail.com
 *  Last modified:     05/04/2020
 *  Program:           CMYKtoRGB.java
 *  Description:       Converts CMYK color codes to RGB color codes
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {

        // Getting CMYK color codes from system line arguments, assigning them to doubles

        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // Making the conversion with the given formula

        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        // Rounding double values to integers and printing out as RGB color codes

        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));
    }
}
