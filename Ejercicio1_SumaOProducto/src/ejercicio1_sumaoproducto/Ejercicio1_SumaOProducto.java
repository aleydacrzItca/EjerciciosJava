/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_sumaoproducto;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio1_SumaOProducto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num1;
        int num2;
 
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();
 
        if (num1 == num2) {
            int suma = num1 + num2;
            System.out.println("Los números son iguales. La suma es: " + suma);
        } else {
            int producto = num1 * num2;
            System.out.println("Los números son diferentes. El producto es: " + producto);
        }
    }
}