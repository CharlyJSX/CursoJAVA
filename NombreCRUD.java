import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NombreCRUD {

    private List<String> nombres;

    public NombreCRUD() {
        nombres = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        nombres.add(nombre);
        System.out.println("El nombre '" + nombre + "' ha sido agregado.");
    }

    public void mostrarNombres() {
        if (nombres.isEmpty()) {
            System.out.println("No hay nombres en la lista.");
        } else {
            System.out.println("Lista de nombres:");
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
        }
    }

    public void actualizarNombre(int indice, String nuevoNombre) {
        if (indice >= 0 && indice < nombres.size()) {
            String nombreAnterior = nombres.get(indice);
            nombres.set(indice, nuevoNombre);
            System.out.println("El nombre '" + nombreAnterior + "' ha sido actualizado a '" + nuevoNombre + "'.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarNombre(int indice) {
        if (indice >= 0 && indice < nombres.size()) {
            String nombreEliminado = nombres.remove(indice);
            System.out.println("El nombre '" + nombreEliminado + "' ha sido eliminado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        NombreCRUD nombreCRUD = new NombreCRUD();
        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("=== CRUD de Nombres ===");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Mostrar nombres");
            System.out.println("3. Actualizar nombre");
            System.out.println("4. Eliminar nombre");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un nombre: ");
                    String nombre = scanner.nextLine();
                    nombreCRUD.agregarNombre(nombre);
                    break;
                case 2:
                    nombreCRUD.mostrarNombres();
                    break;
                case 3:
                    System.out.print("Ingrese el índice del nombre a actualizar: ");
                    int indiceActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    nombreCRUD.actualizarNombre(indiceActualizar, nuevoNombre);
                    break;
                case 4:
                    System.out.print("Ingrese el índice del nombre a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    scanner.nextLine();
                    nombreCRUD.eliminarNombre(indiceEliminar);
                    break;
                case 5:
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();
        }

        scanner.close();
    }
}