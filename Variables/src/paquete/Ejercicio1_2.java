package paquete;
//Ejercicio 1.2
//Objetivo: Solicitar informacion al usuario y mostrar en la pantalla

import java.util.Scanner;

public class Ejercicio1_2{
    public static void main(String[] args, Object[] Salario) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar datos al usuario
        System.out.println("Ingrese su Nombre: ");
        String Nombre = scanner.nextLine();
        System.out.println("Ingrese su Sexo: ");
        String Sexo = scanner.nextLine();
        System.out.println("Ingrese su Edad: ");
        int Edad = scanner.nextInt();
        System.out.println("Ingrese su salario (con centavos: ");
        var salario = scanner.nextDouble();
        System.out.print("¿Tiene vehiculo de trasporte? (true/false):");
        boolean tieneVehiculo = scanner.nextBoolean();
        
        //Mostrar los Datos Ingresados
        System.out.println("Nombre: " + Nombre);
        System.out.println("Sexo: " + Sexo);
        System.out.println("Edad: " + Edad);
        System.out.printf("Salario: $ %.2f\n", Salario);
        System.out.println("¿Tiene vehiculo de trasporte? " + (tieneVehiculo ? "Si" : "No"));       
    }    
}
