/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_parimpar;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio7_ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int num;
 
        System.out.print("Ingrese un número entero: ");
        num = input.nextInt();
 
        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}   