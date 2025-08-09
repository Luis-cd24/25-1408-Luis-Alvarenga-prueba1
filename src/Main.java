import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n===== GESTOR DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar tarea");
            System.out.println("5. Listar tareas por estado");
            System.out.println("6. Eliminar tarea");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = lc.nextInt();
                lc.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Descripción: ");
                        String desc = lc.nextLine();
                        System.out.print("Fecha límite (dd/mm/aaaa): ");
                        String fecha = lc.nextLine();
                        System.out.print("Prioridad (Alta, Media, Baja): ");
                        String prioridad = lc.nextLine();
                        System.out.print("Categoría (Trabajo, Estudio, Personal, Otro): ");
                        String categoria = lc.nextLine();

                        gestor.agregarTarea(new tarea(desc, fecha, prioridad, categoria));
                        System.out.println("✅ Tarea agregada con éxito.");
                        break;

                    case 2:
                        gestor.listarTareas();
                        break;

                    case 3:
                        if (gestor.estaVacia()) {
                            System.out.println("⚠ No hay tareas para marcar.");
                            break;
                        }
                        System.out.print("Ingrese el número de tarea a marcar como completada: ");
                        int indiceCompletada = lc.nextInt() - 1;
                        gestor.marcarTareaComoCompletada(indiceCompletada);
                        break;

                    case 4:
                        if (gestor.estaVacia()) {
                            System.out.println("⚠ No hay tareas para editar.");
                            break;
                        }
                        System.out.print("Ingrese el número de tarea a editar: ");
                        int indiceEditar = lc.nextInt() - 1;
                        lc.nextLine();
                        System.out.print("Nueva descripción: ");
                        String nuevaDesc = lc.nextLine();
                        System.out.print("Nueva fecha límite: ");
                        String nuevaFecha = lc.nextLine();
                        System.out.print("Nueva prioridad: ");
                        String nuevaPrioridad = lc.nextLine();
                        System.out.print("Nueva categoría: ");
                        String nuevaCategoria = lc.nextLine();

                        gestor.editarTarea(indiceEditar, nuevaDesc, nuevaFecha, nuevaPrioridad, nuevaCategoria);
                        break;

                    case 5:
                        if (gestor.estaVacia()) {
                            System.out.println("⚠ No hay tareas registradas.");
                            break;
                        }
                        System.out.print("¿Desea ver (1) Completadas o (2) Pendientes?: ");
                        int tipo = lc.nextInt();
                        boolean completadas = (tipo == 1);
                        gestor.listarTareasPorEstado(completadas);
                        break;

                    case 6:
                        if (gestor.estaVacia()) {
                            System.out.println("⚠ No hay tareas para eliminar.");
                            break;
                        }
                        System.out.print("Ingrese el número de tarea a eliminar: ");
                        int indiceEliminar = lc.nextInt() - 1;
                        gestor.eliminarTarea(indiceEliminar);
                        break;

                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println(" Opción inválida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número.");
                lc.nextLine(); // limpiar entrada incorrecta
            }
        }

        lc.close();
    }
}