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

        // Mostrar los resultados en pantalla
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);

        // Cerrar el objeto Scanner
        sc.close();
    }
}
