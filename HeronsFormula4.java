/*
 * @author Yaaqov Shkifati
 * @since 09/08/19
 * @version 1.0 Description: In this program our objective, is to write a Java
 * program that will compute the area of a triangle, by using Herons Formula. We
 * are given 5 different sets of data, representing lengths of two sides of a
 * triangle that we are calling lengthA and lengthB (variables). Therefore, we
 * need to use the Pythagorean- Theorem to get the length of lengthC, in order
 * to enable us to use the Herons- Formula. Once we having all the variables, we
 * will need to conduct a two-step process. The first step is by finding half
 * perimeter (S) before finding the area. The Formula is s = (a + b + c)/2. The
 * Second step is to find the area of the triangle by using this formula Area=
 * sqrt(s(s-a)(s-b)(s-c)). We will need to add 5 more additional data than what
 * was given to us in order to complete this program.
 *.
 */
package heronsformula4;

import java.util.Scanner;
import java.io.PrintStream;

public class HeronsFormula4 {

    public static double lenghtC, halfP, area; // Golbal Variblies 
    public static Scanner herons = new Scanner(System.in);
    // This Scanner tells the System to remain for the rest of the program.

    public static void main(String[] args) throws Exception {
        double lenghtA, lenghtB;

        PrintStream tri = new PrintStream("Herons.txt");
        
        getArea();

        promptUser();
        lenghtA = herons.nextDouble();
        while (lenghtA > 0) {
            lenghtB = herons.nextDouble();

            lenghtC = Math.sqrt(lenghtA * lenghtA + lenghtB * lenghtB);

            halfP = ((lenghtA + lenghtB + lenghtC) / 2);

            area = Math.sqrt(halfP * (halfP - lenghtA) * (halfP - lenghtB)
                    * (halfP - lenghtC));

            tri.printf("%n lenghtA = %.0f%n lenghtB = %.0f%n lenghtC = %.0f%n",
                    lenghtA, lenghtB, lenghtC);
            tri.printf("halfP = %.0f %n area = %.0f %n%n ",
                    halfP, area);

            promptUser();
            lenghtA = herons.nextDouble();

        }

    }

    public static void promptUser() {
        System.out.println("Enter zero to stop ");

    }

    public static void getArea() {
        System.out.println("Please enter lengthA and lengthB");

    }
}

