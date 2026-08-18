/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_promedionotas;

/**
 *
 * @author User
 */
import java.util.Scanner;
 
public class Ejercicio12_PromedioNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int cantidadAlumnos;
 
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidadAlumnos = input.nextInt();
 
        double sumaNotas = 0;
        int i = 1;
 
        while (i <= cantidadAlumnos) {
            double nota;
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            nota = input.nextDouble();
            sumaNotas += nota;
            i++;
        }
 
        double promedio = sumaNotas / cantidadAlumnos;
 
        System.out.println("La cantidad de alumnos es: " + cantidadAlumnos);
        System.out.println("La suma total de notas es: " + sumaNotas);
        System.out.println("La nota promedio del grupo es: " + promedio);
    }
}