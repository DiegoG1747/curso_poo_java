package paquete;

public class clase {
    
    public static void main(String[] args) {
        //Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entrada, Proceso y Salida]
        System.out.println("Numero Mayor, Menor o igual");
        
        //Declarar variables, constantes y/o arreglos.
        int num01, num02;
        
        //Dimencionar arreglos.
        
        //Iniciar variables, constantes y/o arreglos
        num01 = 5;
        num02 = 5;
        
        //Entrada de Datos: Pueden ser solicitados o no
        
        //Procesos:Determinar los requerimentos y validaciones. Generalmente,
        //         se usan las esteucturas de control: Secuencial, condicional, repeticion.
        if (num01 > num02) {
            //Salida de Datos. Resultado(s).
            System.out.println("El Numero Uno es mayor al Numero Dos");
        } else {
            if (num01 == num02) {
                //Salida de Datos. Resultado(s).
                System.out.println("Los numeros son iguales");
            } else {
                //Salida de Datos. Resultados(s).
                System.out.println("El Numero Dos es mayor al Numero Uno");
            }
        }
    }
    
}