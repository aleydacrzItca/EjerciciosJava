/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_factorial;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio5_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num;
 
        System.out.print("Ingrese un número entero: ");
        num = input.nextInt();
 
        long factorial = 1;
        int i = 1;
 
        while (i <= num) {
            factorial *= i;
            i++;
        }
 
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}