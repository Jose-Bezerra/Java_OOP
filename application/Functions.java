package application;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a, b, c);
        System.out.println(higher);

        System.out.println(a);

        scanner.close();
    }

    private static int max(int a, int b, int c) {
        int aux;
        if (a > b && a < c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        }  else {
            aux = c;
        }
        return aux;
    }
}
