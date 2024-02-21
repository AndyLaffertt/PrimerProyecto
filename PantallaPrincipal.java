import java.util.ArrayList;

import java.util.Scanner;



public class ListaTareas {

    private ArrayList<String> tareas;



    public ListaTareas() {

        tareas = new ArrayList<>();

    }



    public void agregarTarea(String tarea) {

        tareas.add(tarea);

    }



    public void mostrarTareas() {

        System.out.println("----- Lista de Tareas----");

        for (int i = 0; i < tareas.size(); i++) {

            System.out.println((i + 1) + ". " + tareas.get(i));

        }

    }



    public void eliminarTareas() {

        System.out.println("----- Lista de Tareas----");

        for (int i = 0; i < tareas.size(); i++) {

            System.out.println((i + 1) + ". " + tareas.get(i));

        }

    }





    public static void main(String[] args) {

        ListaTareas listaTareas = new ListaTareas();

        Scanner scanner = new Scanner(System.in);

        int opcion;



        do {

            System.out.println("----- Menú -----");

            System.out.println("1. Agregar Tarea");

            System.out.println("2. Mostrar Tareas Completadas");

            System.out.println("3. Eliminar Tareas");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();



            switch (opcion) {

                case 1:

                    scanner.nextLine(); 

                    System.out.print("Ingrese la nueva tarea: ");

                    String nuevaTarea = scanner.nextLine();

                    listaTareas.agregarTarea(nuevaTarea);

                    System.out.println("Tarea agregada correctamente.");

                    break;

                case 2:

                    listaTareas.mostrarTareas();

                    break;

                case 3:

                    listaTareas.eliminarTareas();

                    break;

                default:

                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");

            }

        } while (opcion != 3);



        scanner.close();

    }

}
