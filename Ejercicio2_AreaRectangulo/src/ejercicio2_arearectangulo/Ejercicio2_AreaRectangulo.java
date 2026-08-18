/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_arearectangulo;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio2_AreaRectangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        double base;
        double altura;
 
        System.out.print("Ingrese la base del rectángulo: ");
        base = input.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = input.nextDouble();
 
        double area = base * altura;
 
        System.out.println("El área del rectángulo es: " + area);
    }
}
 
