/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11_sueldosemanal;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio11_SueldoSemanal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        String nombreEmpleado;
        char clase;
        double horasTrabajadas;
 
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = input.nextLine();
        System.out.print("Ingrese la clase de puesto (A, B, C o D): ");
        clase = input.next().toUpperCase().charAt(0);
        System.out.print("Ingrese las horas trabajadas durante la semana: ");
        horasTrabajadas = input.nextDouble();
 
        double pagoPorHora;
 
        switch (clase) {
            case 'A':
                pagoPorHora = 7.00;
                break;
            case 'B':
                pagoPorHora = 8.50;
                break;
            case 'C':
                pagoPorHora = 10.00;
                break;
            case 'D':
                pagoPorHora = 12.50;
                break;
            default:
                pagoPorHora = 0.0;
        }
 
        if (pagoPorHora == 0.0) {
            System.out.println("Clase de puesto inválida.");
        } else {
            double sueldoSemanal = horasTrabajadas * pagoPorHora;
 
            System.out.println("Empleado: " + nombreEmpleado);
            System.out.println("Clase de puesto: " + clase);
            System.out.println("Horas trabajadas: " + horasTrabajadas);
            System.out.println("Sueldo semanal: $" + sueldoSemanal);
        }
    }
}
 
