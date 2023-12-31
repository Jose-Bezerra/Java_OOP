package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle x:");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle y:");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        // Cálculo da área do triangulo pela fórmula de Heron
        double p = (xA + xB + xC) / 2; // p equivale ao semi-perímetro
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p -xC));

        p = (yA + yB + yC) / 2; // p equivale ao semi-perímetro
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p -yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger Area X.");
        } else {
            System.out.println("Larger Area Y.");
        }

        scanner.close();

    }


}
