/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_descuentorenta;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio4_DescuentoRenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        double sueldo;
 
        System.out.print("Ingrese el sueldo mensual del empleado: $");
        sueldo = input.nextDouble();
 
        // Tabla de retención de ISR (referencia El Salvador, tramos mensuales)
        double descuentoRenta;
 
        if (sueldo <= 472.00) {
            descuentoRenta = 0.0;
        } else if (sueldo <= 895.24) {
            descuentoRenta = (sueldo - 472.00) * 0.10 + 17.67;
        } else if (sueldo <= 2038.10) {
            descuentoRenta = (sueldo - 895.24) * 0.20 + 60.00;
        } else {
            descuentoRenta = (sueldo - 2038.10) * 0.30 + 288.57;
        }
 
        double sueldoNeto = sueldo - descuentoRenta;
 
        System.out.println("Sueldo mensual: $" + sueldo);
        if (descuentoRenta == 0.0) {
            System.out.println("El empleado está exento de renta.");
        } else {
            System.out.println("Se aplica descuento de renta.");
        }
        System.out.println("Descuento de renta: $" + descuentoRenta);
        System.out.println("Sueldo total que recibirá el empleado: $" + sueldoNeto);
    }
}
 