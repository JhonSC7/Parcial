import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReserva sistema = new SistemaReserva();
        int opcion;

        System.out.println("Lista de usuarios:");
        sistema.mostrarUsuarios();
        System.out.println("Lista de vuelos:");
        sistema.mostrarVuelos();


        do {
            System.out.println("\n--- MENÚ DEL SISTEMA DE RESERVAS ---");
            System.out.println("1. Ver información de usuario");
            System.out.println("2. Ver información de vuelo");
            System.out.println("3. Reservar un vuelo");
            System.out.println("4. Ver todas las reservas");
            System.out.println("5. Ver reservas de un usuario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del usuario: ");
                    int userId = scanner.nextInt();
                    Usuario u = sistema.buscarUsuario(userId);
                    if (u != null) {
                        System.out.println("Información del usuario:");
                        System.out.println(u);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese número de vuelo: ");
                    int numVuelo = scanner.nextInt();
                    Vuelo v = sistema.buscarVuelo(numVuelo);
                    if (v != null) {
                        System.out.println("Información del vuelo:");
                        System.out.println(v);
                    } else {
                        System.out.println("Vuelo no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    System.out.print("Ingrese número del vuelo: ");
                    int vueloId = scanner.nextInt();
                    sistema.reservarVuelo(idUsuario, vueloId);
                    break;

                case 4:
                    System.out.println("\n--- TODAS LAS RESERVAS ---");
                    sistema.mostrarReservas();
                    break;

                case 5:
                    System.out.print("Ingrese ID del usuario: ");
                    int id = scanner.nextInt();
                    System.out.println("\n--- RESERVAS DEL USUARIO ---");
                    sistema.mostrarReservasDeUsuario(id);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
