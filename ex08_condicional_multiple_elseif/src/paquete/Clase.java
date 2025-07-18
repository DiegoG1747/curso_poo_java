package paquete;

public class Clase {

    public static void main(String[] args) {
        // Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
       System.out.println("Dia de la semana");
       
       //Declarar variables, constantes y/o arreglos e iniciarlos.
       int dia = 1;
              String nombreDia = "";
              
       //Dimensionar arreglos.
       
       //Entrada de Datos: Pueden ser solicitados o no
       
       //Proceso: Determinar los requerimentos y validaciones. Generalmente,
       //         se usan las estructuras de control: Secuencial, condicional, repeticion.
       if (dia == 1) {
           nombreDia = "Lunes";
       } else if (dia == 2) {
           nombreDia = "Martes";
       } else if (dia == 3) {
           nombreDia = "Miercoles";
       } else if (dia == 4) {
           nombreDia = "Jueves";
       } else if (dia == 5) {
           nombreDia = "Viernes";
       } else if (dia == 6) {
           nombreDia = "Sabado";
       } else if (dia == 7) {
           nombreDia = "Domingo";
       } else {
           nombreDia = "No es un dia de la Semana";
       }
        
       //Salida de Datos. Resultados(s).
       System.out.println("El dia seleciionado de la semana es: " + nombreDia);
    }
    
}