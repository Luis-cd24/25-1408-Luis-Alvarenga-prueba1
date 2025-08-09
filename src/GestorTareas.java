import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<tarea> listaTareas;

    public GestorTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(tarea t) {
        listaTareas.add(t);
    }

    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println("Tarea #" + (i + 1));
            listaTareas.get(i).mostrarInfo();
        }
    }

    public void listarTareasPorEstado(boolean completadas) {
        boolean encontrado = false;
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).isCompletada() == completadas) {
                System.out.println("Tarea #" + (i + 1));
                listaTareas.get(i).mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay tareas con ese estado.");
        }
    }

    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).marcarComoCompletada();
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void editarTarea(int indice, String descripcion, String fechaLimite, String prioridad, String categoria) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).editarTarea(descripcion, fechaLimite, prioridad, categoria);
            System.out.println("Tarea editada con éxito.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
            System.out.println("Tarea eliminada con éxito.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}