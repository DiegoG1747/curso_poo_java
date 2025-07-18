package paquete;

public class clase {

    public static void main(String[] args) {
        //Objetivo del Algoritmo:Analizar el Objetivo / Problema como un Sistema [Entradas, Procesos y Salidas]
        System.out.println("Contador de vueltas");
        
        //Declarar variables, constantes y/o arreglos e iniciarlos.
        int cont= 0;
        
        //Dimencionar arreglos.
        
        //Entrada de Datos:Pueden ser solicitados o no
        
        //Proceso: Generalmente, se usan las estructuras de control: Secuenciale, condicional, repeticion.
        do {
            //Salida de Datos. Resultado(s)
            System.out.println("EEstoy en la vuelta: " + cont);
            cont = cont + 1;
        } while (cont <= 10);

    }
    
}