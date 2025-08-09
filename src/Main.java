import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar tarea");
            System.out.println("5. Listar tareas por estado");
            System.out.println("6. Eliminar tarea");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lc.nextInt();
            lc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Función para agregar tarea");
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.println("Función para marcar como completada");
                    break;
                case 4:
                    System.out.println("Función para editar tarea");
                    break;
                case 5:
                    System.out.println("Función para listar por estado");
                    break;
                case 6:
                    System.out.println("Función para eliminar tarea");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        lc.close();
    }
}