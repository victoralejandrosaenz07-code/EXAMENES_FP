/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_25550472;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EXAMEN2_25550472 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primo, noPrimo;

        // Pedir número primo
        System.out.print("Dame un numero primo: ");
        primo = sc.nextInt();
        while (!esPrimo(primo)) {
            System.out.print("Ese no es primo, dame otro: ");
            primo = sc.nextInt();
        }

        // Pedir número NO primo
        System.out.print("Dame un numero NO primo: ");
        noPrimo = sc.nextInt();
        while (esPrimo(noPrimo)) {
            System.out.print("Ese es primo, dame uno NO primo: ");
            noPrimo = sc.nextInt();
        }
        System.out.println("\nPiramide del primo:");
        piramideLado(primo);

        System.out.println("\nPiramide del no primo:");
        piramideLado(noPrimo);
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void piramideLado(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}


