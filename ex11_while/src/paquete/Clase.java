package paquete;

public class Clase {
    
    public static void main(String[] args) {
        //Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entrada, Proceso y Salida]
        System.out.println("Contador de vueltas");
        
        //Declarar variables, constantes y/o arreglos e iniciarlos.
        int cont = 0;
        
        //Dimencionar arreglos.
        
        //Entrada de Datos: Pueden ser solicitados o no
        
        //Proceso: Generalmente, se usan las estructuras de control: Secuencial, condicional, repeticion.
        while (cont <=10) {
            //Salida de Datos. Resultados(s)
            System.out.println("Estoy en la vuelta: " + cont);
            cont = cont + 1;
        }
        
    }
    
}