/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_primeros100primos;

/**
 *
 * @author User
 */
public class Ejercicio6_Primeros100Primos {
    public static void main(String[] args) {
 
        int contador = 0;
        int numero = 2;
 
        System.out.println("Los primeros 100 números primos son:");
 
        while (contador < 100) {
            if (esPrimo(numero)) {
                System.out.print(numero + "  ");
                contador++;
            }
            numero++;
        }
    }
 
    // Método que determina si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
 
        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
 