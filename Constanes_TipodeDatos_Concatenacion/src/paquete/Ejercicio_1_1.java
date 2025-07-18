package paquete;
//Ejercicio 1.1
//Objetivo: Mostrar datos personales en pantalla

public class Ejercicio_1_1 {
    public static void main(String[] argus) {
        //Datos personales
        String Nombre = "Diego Guerrero";
        String Sexo = "Masculino";
        int Edad = 18;
        double Salario = 1234.56;
        boolean tieneVehiculo = true;
        
        //Mostrar pantalla
        System.out.println("Nombre: " + Nombre);
        System.out.println("Sexo: " + Sexo);
        System.out.println("Edad: " + Edad);
        System.out.printf("Salario: $ %.2f\n", Salario);
        System.out.println("¿Tiene vehiculo de trasporte? " + (tieneVehiculo? "Si" : "No"));
    }
    
}