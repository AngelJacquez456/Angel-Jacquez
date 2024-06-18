
package ejemplointerfaces;

import java.util.Scanner;

public class pruebaInterface {
    public static void main(String[] args) {
        // Solicitar 2 números y mostrar cuál es mayor, menor o si son iguales.
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclea el número uno:");
        int numero1 = sc.nextInt();

        System.out.println("Teclea el número dos:");
        int numero2 = sc.nextInt();

        // Creamos un objeto de la clase Comparaciones
        Comparaciones comparacion = new Comparaciones(numero1, numero2);

        // Hacemos uso de los tres métodos implementados en la clase
        if (comparacion.esMayorQue(comparacion)) {
            System.out.println(numero1 + " > " + numero2);
        } else if (comparacion.esMenorQue(comparacion)) {
            System.out.println(numero1 + " < " + numero2);
        } else if (comparacion.esIgualQue(comparacion)) {
            System.out.println(numero1 + " = " + numero2);
        }

        sc.close(); // Cerramos el Scanner para evitar posibles fugas de recursos
    }
}
