package paquete;

import java.util.Scanner;

public class Clase {

    public static void main(String[] args) {
        //Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema
        // [Entrada, Proceso y Salida]
        System.out.println("Arreglo de dos dimensiones. Matriz");
        
        //Declarar variables, constantes, arreglos u objetos.
        int matriz[][];
        Scanner ent = new Scanner(System.in);
        
        //Dimensionar arreglos.
        matriz = new int[3][3];
        
        //Iniciar variables, constantes, arreglos u objetos.
        
        //Procesos:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                //Entrada de Datos
                System.out.print("Ingrese el valor de [ i = " + i + " | j =  " + j + "] : ");
                matriz[i][j] = ent.nextInt();
            }
        }
        
        //Proceso:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //Salida de Datos
                System.out.println("En: [ i = " + i + " | j = " + j + "] : " + matriz[i][j]);              
            }
        }        
    }   
}