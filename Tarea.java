public class Tarea {


    // Atributos privados
    private String descripcion;
    private int prioridad;
    private boolean completada;


    // Constructor con prioridad por defecto (2 = Media)
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.prioridad = 2;
        this.completada = false;
    }


    // Constructor con prioridad personalizada
    public Tarea(String descripcion, int prioridad) {
        if (prioridad < 1 || prioridad > 3) {
            throw new IllegalArgumentException(
                "La prioridad debe estar entre 1 y 3"
            );
        }


        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }


    // Métodos getters
    public String getDescripcion() {
        return descripcion;
    }


    public int getPrioridad() {
        return prioridad;
    }


    public boolean isCompletada() {
        return completada;
    }


    // Cambiar prioridad
    public void setPrioridad(int nuevaPrioridad) {
        if (nuevaPrioridad >= 1 && nuevaPrioridad <= 3) {
            this.prioridad = nuevaPrioridad;
        } else {
            System.out.println("Error: prioridad inválida.");
        }
    }


    // Marcar tarea como completada
    public void marcarComoCompletada() {
        this.completada = true;
    }


    // Mostrar información de la tarea
    public void mostrarEstado() {
        System.out.println("Descripción: " + descripcion);


        String nivel;


        switch (prioridad) {
            case 1:
                nivel = "Alta";
                break;
            case 2:
                nivel = "Media";
                break;
            case 3:
                nivel = "Baja";
                break;
            default:
                nivel = "Desconocida";
        }


        System.out.println("Prioridad: " + nivel);
        System.out.println("Completada: " +
            (completada ? "Sí" : "No"));
        System.out.println("-------------------------");
    }
}