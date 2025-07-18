import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double numero1, numero2;

        do {
            System.out.println("\n===== MENU CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione la Opcion: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer numero: ");
                numero1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                numero2 = scanner.nextDouble();

                Calculadora calc = new Calculadora(numero1, numero2);

                switch (opcion) {
                    case 1:
                        System.out.println("El resultado es = " + (int) calc.sumar());
                        break;
                    case 2:
                        System.out.println("El resultado es = " + (int) calc.restar());
                        break;
                    case 3:
                        System.out.println("El resultado es = " + (int) calc.multiplicar());
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.println("El resultado es = " + (int) calc.dividir());
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
                        break;
                    default:
                        System.out.println("Opcion inválida.");
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Gracias por usar esta calculadora");
            } else {
                System.out.println("Opcion no válida.");
            }

        } while (opcion != 5);
    }
}
