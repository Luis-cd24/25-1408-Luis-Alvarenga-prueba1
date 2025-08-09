public class tarea {
    private String descripcion;
    private String fechaLimite;
    private String prioridad;
    private String categoria;
    private boolean completada;

    // Constructor
    public tarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.categoria = categoria;
        this.completada = false; // Por defecto está pendiente
    }

    // Getters y Setters, ya que los atributos que declare son privados
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFechaLimite() { return fechaLimite; }
    public void setFechaLimite(String fechaLimite) { this.fechaLimite = fechaLimite; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha Límite: " + fechaLimite);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Categoría: " + categoria);
        System.out.println("Estado: " + (completada ? "Completada" : "Pendiente"));
        System.out.println("------------------------------");
    }

    // Marcar como completada
    public void marcarComoCompletada() {
        this.completada = true;
    }

    // Editar tarea
    public void editarTarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.categoria = categoria;
    }
}
