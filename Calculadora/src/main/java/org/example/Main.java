package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int intentos = 0;
        final int MAX_INTENTOS = 5;

        while (intentos < MAX_INTENTOS) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            intentos++;

            switch (opcion) {
                case 1:
                    calculadora.suma();
                    break;
                case 2:
                    calculadora.resta();
                    break;
                case 3:
                    calculadora.multiplicacion();
                    break;
                case 4:
                    calculadora.division();
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción entre 1 y 5.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Has alcanzado el número máximo de intentos.");
        sc.close();
    }
}
