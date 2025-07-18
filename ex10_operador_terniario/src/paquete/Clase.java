package paquete;

public class Clase {
    
    public static void main(String[] args) {
        //Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
        System.out.println("Operador terniario");
        
        //Declarar variables, constantes y/o arreglos e iniciarlos.
        double promedio = 6;
        String condicionFinal;
        
        //Dimencionar arreglos.
        
        //Entrada de Datos: Pueden ser solicitados o no
        
        //Proceso: Generalmente, se usan las estructuras de control: Secuencial, condicional, repeticion.
        condicionFinal = promedio>=6 ? "Aprobado" : "Desaprobado" ;
        
        //Salida de Datos. Resultado(s).
        System.out.println("La condicion final del alumno es: " + condicionFinal);
    }
    
}