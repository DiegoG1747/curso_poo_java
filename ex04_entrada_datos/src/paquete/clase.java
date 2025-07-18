package paquete;
import java.util.Scanner;

public class clase {

    public static void main(String[] args) {
        // Objetivo del Algoritmo: Analisar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
        System.out.println("Ingresar Datos:/n");
        
        // Declarar variables, constantes, arreglos u objetos.
        int numero;
        String nombre;
        char letra;
        double temperatura;
        boolean estado;
        long numeroLargo;
        Scanner in = new Scanner(System.in);
        
        // Dimencionar: arreglos.
        
        // Iniciar: variables, constantes y/o arreglos
        
        // Entrada de Datos:Pueden ser solicitados o no
        System.out.print("Ingrese numero: ");
        numero = in.nextInt();
        System.out.print("Ingrese nombre: ");
        nombre = in.next();
        System.out.print("Ingrese una letra: ");
        letra = in.next ().charAt(0);
        System.out.print("Ingrese un valor de temperatura");
        temperatura = in.nextDouble();
        System.out.print("Ingrese un estado(Verdadero = true, Falso = false): ");
        estado = in.nextBoolean();
        System.out.print("Ingrese un numero largo: ");
        numeroLargo = in.nextLong();
        
        // Proceso: Generalmente, se usan las estructuras de control: Secuencial, condicional, repeticion.
        
        //Salida de Datos: Resultado(s).
        System.out.println("\nEl número ingresado fue: " + numero);    
        System.out.println("El nombre ingresado fue: " + nombre);
        System.out.println("La letra ingresada fue: " + letra);
        System.out.println("La temperatura ingresada fue: " + temperatura);
        System.out.println("El estado ingresado fue: " + estado);
        System.out.println("El numero largo ingresado fue: " + numeroLargo);                       
    }    
}
