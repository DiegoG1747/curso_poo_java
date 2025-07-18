package paquete;

import java.util.Scanner;

public class clase {
    
    public static void main(String[] args) {
        //Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema
        //[Entradas, Proceso y Salidas]
        System.out.println("Arreglo en una dimension. Vector");
        
        //Declarar variables, constantes, arreglos u objetos.
        int vector[];
        Scanner ent = new Scanner(System.in);
        
        //Dimensionar arreglos.
        vector = new int[4];
        
        //Iniciar variables, constantes, arreglos u objetos.
        
        //Proceso:
        for (int i = 0; i < vector.length; i++) {
            //Entrada de Datos
            System.out.println("Ingrese el valor [" + (i + 1) + " de " + vector.length + "]: ");
            vector[i] = ent.nextInt();      
        }
        
        //Proceso:
        for (int i = 0; i < vector.length; i++) {
            //Salida de Datos
            System.out.println("Posicion: " + (i + 1) + ". indice: " + i + ".Valor: " + vector[i]);  
        }
    }   
}