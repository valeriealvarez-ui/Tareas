

public class Main {
    public static void main(String[] args) {


        // Crear tareas
        Tarea tarea1 = new Tarea("Estudiar Java");
        Tarea tarea2 = new Tarea("Hacer ejercicios", 1);
        Tarea tarea3 = new Tarea("Entregar proyecto", 3);
       Tarea tarea4= new Tarea("Hacer video pitch");
    
    

        // Mostrar tareas inicialmente
        System.out.println("LISTA DE TAREAS:");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();


        // Cambiar prioridad
        tarea1.setPrioridad(1);


        // Marcar como completada
        tarea2.marcarComoCompletada();


        // Mostrar estados actualizados
        System.out.println("ESTADOS ACTUALIZADOS:");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
        tarea4.mostrarEstado();
      


    }
}