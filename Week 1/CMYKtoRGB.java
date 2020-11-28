/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double w = 1-k;

        int Red = (int) Math.round(255 * w * (1.0 - c));
        int Green = (int) Math.round(255 * w * (1.0 - m));
        int Blue = (int) Math.round(255 * w *(1.0 - y));

        System.out.println("red = " +Red);
        System.out.println("green = "+ Green);
        System.out.print("blue = "+ Blue);

    }
}