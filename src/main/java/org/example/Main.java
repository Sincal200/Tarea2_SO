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

        // Calcular el cuadrado de los números
        double cuadrado1 = numero1 * numero1;
        double cuadrado2 = numero2 * numero2;

        // Calcular el cubo de los números
        double cubo1 = numero1 * numero1 * numero1;
        double cubo2 = numero2 * numero2 * numero2;

        // Calcular la raíz cuadrada solo si ambos números son positivos
        double raiz1 = 0;
        double raiz2 = 0;
        if (numero1 >= 0) {
            raiz1 = Math.sqrt(numero1);
        } else {
            System.out.println("No se puede calcular la raiz del primer numero, debe ser mayor o igual a cero.");
        }

        if (numero2 >= 0) {
            raiz2 = Math.sqrt(numero2);
        } else {
            System.out.println("No se puede calcular la raiz del segundo numero, debe ser mayor o igual a cero.");
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

        System.out.println("La raiz cuadrada del primer numero es: " + raiz1);
        System.out.println("La raiz cuadrada del segundo numero es: " + raiz2);

        System.out.println("El cuadrado del primer numero es: " + cuadrado1);
        System.out.println("El cuadrado del segundo numero es: " + cuadrado2);

        System.out.println("El cubo del primer numero es: " + cubo1);
        System.out.println("El cubo del segundo numero es: " + cubo2);

        // Cerrar el objeto Scanner
        sc.close();
    }
}
