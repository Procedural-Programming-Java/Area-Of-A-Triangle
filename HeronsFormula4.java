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

