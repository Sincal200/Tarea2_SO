package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        // Realizar la suma y la resta
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;

        // Verificar que el segundo número no sea cero para evitar división por cero
        double division = 0;
        if (numero2 != 0) {
            division = numero1 / numero2;
        }

        // Mostrar los resultados en pantalla
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("La division de los numeros es: " + division);
        } else {
            System.out.println("No se puede realizar la division, el segundo numero es cero.");
        }
        // Cerrar el objeto Scanner
        sc.close();
    }
}
