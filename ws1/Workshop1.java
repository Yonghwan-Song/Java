/**
 * Full Name: Yonghwan Song Student ID: 135458198 Email: ysong115@myseneca.ca
 */
public class Workshop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {

            /** For indentation */
            for (int j = 0; j < 7 - i; j++) {
                System.out.print("    ");
            }
            /**
             * variable x will be printed throughout three parts. The first is an initial
             * value, which is just 1. The second part is reflecting increase. The last part
             * is showing the decrease until x becomes 1.
             */
            /**
             * initialization and printing the value. Each iteration of the outer-most for
             * loop will make x have 1 again so that each line in the output display 1 at
             * the beginning
             */
            int x = 1;
            System.out.printf("%4d", x);
            /** For the increase */
            for (int k = 0; k < i; k++) {
                x *= 2;
                System.out.printf("%4d", x);
            }
            /** For the decrease */
            for (int k = 0; k < i; k++) {
                x /= 2;
                System.out.printf("%4d", x);
            }
            System.out.print('\n');
        }
    }
}