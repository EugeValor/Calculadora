package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    Scanner sc = new Scanner(System.in);

    public void suma() {
        Double suma1 = null, suma2 = null;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese el primer número a sumar");
                suma1 = sc.nextDouble();
                System.out.println("Ingrese el segundo número a sumar");
                suma2 = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                sc.next();
            }
        }

        Double rsuma = suma1 + suma2;

        if (rsuma < 0) {
            System.out.println("Tené cuidado, el resultado es negativo");
        } else if (rsuma >= 0 && rsuma < 10000) {
            System.out.println("Resultado dentro de los límites");
        } else {
            System.out.println("Error, resultado muy grande");
        }
    }

    public void resta() {
        Double resta1 = null, resta2 = null;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese el primer número a restar");
                resta1 = sc.nextDouble();
                System.out.println("Ingrese el segundo número a restar");
                resta2 = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                sc.next();
            }
        }

        Double rresta = resta1 - resta2;

        if (rresta < 0) {
            System.out.println("Tené cuidado, el resultado es negativo");
        } else if (rresta >= 0 && rresta < 10000) {
            System.out.println("Resultado dentro de los límites");
        } else {
            System.out.println("Error, resultado muy grande");
        }
    }

    public void multiplicacion() {
        Double mult1 = null, mult2 = null;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese el primer número a multiplicar");
                mult1 = sc.nextDouble();
                System.out.println("Ingrese el segundo número a multiplicar");
                mult2 = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                sc.next();
            }
        }

        Double rmult = mult1 * mult2;

        if (rmult < 0) {
            System.out.println("Tené cuidado, el resultado es negativo");
        } else if (rmult >= 0 && rmult < 10000) {
            System.out.println("Resultado dentro de los límites");
        } else {
            System.out.println("Error, resultado muy grande");
        }
    }

    public void division() {
        Double div1 = null, div2 = null;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Ingrese el primer número a dividir");
                div1 = sc.nextDouble();
                System.out.println("Ingrese el segundo número divisor");
                div2 = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                sc.next();
            }
        }

        if (div2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return;
        }

        Double rdiv = div1 / div2;

        if (rdiv < 0) {
            System.out.println("Tené cuidado, el resultado es negativo");
        } else if (rdiv >= 0 && rdiv < 10000) {
            System.out.println("Resultado dentro de los límites");
        } else {
            System.out.println("Error, resultado muy grande");
        }
    }
}
