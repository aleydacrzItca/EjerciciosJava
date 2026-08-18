/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8_cuadrante;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio8_Cuadrante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        double x;
        double y;
 
        System.out.print("Ingrese la coordenada X: ");
        x = input.nextDouble();
        System.out.print("Ingrese la coordenada Y: ");
        y = input.nextDouble();
 
        if (x == 0 && y == 0) {
            System.out.println("El punto está en el origen.");
        } else if (x == 0) {
            System.out.println("El punto está sobre el eje Y.");
        } else if (y == 0) {
            System.out.println("El punto está sobre el eje X.");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto está en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto está en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto está en el tercer cuadrante.");
        } else {
            System.out.println("El punto está en el cuarto cuadrante.");
        }
    }
}
 