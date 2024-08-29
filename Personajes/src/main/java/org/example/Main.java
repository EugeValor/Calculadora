package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Espadachin espadachin = null;
        Torre torre = null;
        Mago mago = null;

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\nSelecciona un personaje para entrenar o 4 para salir: ");
                System.out.println("1. Espadachín");
                System.out.println("2. Torre");
                System.out.println("3. Mago");
                System.out.println("4. Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        if (espadachin == null) {
                            espadachin = new Espadachin(100, 10);
                        }
                        mostrarYEntrenar(espadachin);
                        break;
                    case 2:
                        if (torre == null) {
                            torre = new Torre(150, 1);
                        }
                        mostrarYEntrenar(torre);
                        break;
                    case 3:
                        if (mago == null) {
                            mago = new Mago(200, "Fuego");
                        }
                        mostrarYEntrenar(mago);
                        break;
                    case 4:
                        continuar = false;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 4.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número válido.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static void mostrarYEntrenar(Personaje personaje) {
        System.out.println("\nPersonaje seleccionado antes de entrenar:");
        mostrarDetallesPersonaje(personaje);

        personaje.entrenar();

        System.out.println("Después de entrenar:");
        mostrarDetallesPersonaje(personaje);
    }

    public static void mostrarDetallesPersonaje(Personaje personaje) {
        if (personaje instanceof Espadachin) {
            Espadachin espadachin = (Espadachin) personaje;
            System.out.println("Espadachín con salud: " + espadachin.getSalud() + ", ataque: " + espadachin.getAtaque());
        } else if (personaje instanceof Torre) {
            Torre torre = (Torre) personaje;
            System.out.println("Torre con salud: " + torre.getSalud() + ", nivel: " + torre.getNivel());
        } else if (personaje instanceof Mago) {
            Mago mago = (Mago) personaje;
            System.out.println("Mago con salud: " + mago.getSalud() + ", magia: " + mago.getMagia());
        }
    }
}
