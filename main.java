/*
    Resources consulted:
        https://www.cuemath.com/numbers/multiplying-complex-numbers/
        https://www.cuemath.com/numbers/division-of-complex-numbers/
 */

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();

        int real1 = rand.nextInt(1, 100);
        int imaginary1 = rand.nextInt(1, 100);
        int real2 = rand.nextInt(1, 100);
        int imaginary2 = rand.nextInt(1, 100);
        complexNumber c1 = new complexNumber(real1, imaginary1);
        complexNumber c2 = new complexNumber(real2, imaginary2);

        complexNumber sum = new complexNumber(-1, -1); // temporary values just so i can initialize object.

        System.out.println("Complex Number 1: " + real1 + " + " + imaginary1 + "i");
        System.out.println("Complex Number 2: " + real2 + " + " + imaginary2 + "i");

        sum = sum.add(c1, c2);
        System.out.print("Addition: ");
        sum.printComplexNum();

        sum = sum.subtract(c1, c2);
        System.out.print("Subtraction: ");
        sum.printComplexNum();

        sum = sum.multiplication(c1, c2);
        System.out.print("Multiplication: ");
        sum.printComplexNum();

        sum = sum.division(c1, c2);
        System.out.print("Division: ");
        sum.printComplexNum();
    }
}
