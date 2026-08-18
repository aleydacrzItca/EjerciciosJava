/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_hipotenusa;

/**
 *
 * @author User
 */
public class Ejercicio3_Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        double catetoA;
        double catetoB;
 
        System.out.print("Ingrese la longitud del cateto A: ");
        catetoA = input.nextDouble();
        System.out.print("Ingrese la longitud del cateto B: ");
        catetoB = input.nextDouble();
 
        // Teorema de Pitágoras: c = raíz(a^2 + b^2)
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
 
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }
}