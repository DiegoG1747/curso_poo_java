import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        // Variables para Rol
        int rol_id = 0;
        String rol_name = "";

        // Variables para Usuario
        int user_id = 0;
        String user_name = "";

        // Menu
        System.out.println("===== MENU =====");
        System.out.println("1. Crear Rol");
        System.out.println("2. Crear Usuario");
        System.out.print("Seleccione una opcion: ");
        int opcion = ent.nextInt();
        ent.nextLine(); // Limpiar buffer

        // Opción 1: Crear un Rol
        if (opcion == 1) {
            System.out.print("Ingrese ID del Rol: ");
            rol_id = ent.nextInt();
            ent.nextLine(); // limpiar buffer

            System.out.print("Ingrese Nombre del Rol: ");
            rol_name = ent.nextLine();

            System.out.println("Rol creado correctamente.\n");

        // Opcion 2: Crear un Usuario.
        } else if (opcion == 2) {
            System.out.print("Ingrese ID del Usuario: ");
            user_id = ent.nextInt();
            ent.nextLine(); // limpiar buffer.

            System.out.print("Ingrese nombre del Usuario: ");
            user_name = ent.nextLine();

            System.out.println("Usuario creado correctamente.\n");
        }

        // Mostrar mensaje final como pide la pizarra.
        if (rol_id != 0 && !rol_name.equals("")) {
            System.out.println("El Id del Rol es " + rol_id + " y su Rol es " + rol_name);
       
        }
    }
}