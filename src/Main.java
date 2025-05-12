import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario[] usuarios = new Usuario[8];
        for (int i = 0; i < 2; i++) {
            usuarios[i] = new Usuario();
            System.out.println("crear tu usuario: ");

                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                    System.out.println("===== MENÚ PRINCIPAL =====");
                    System.out.println("1. mostrar informacion de usuario");
                    System.out.println("2. consultar informacion de vuelo");
                    System.out.println("3. consultar reserva");
                    System.out.println("4. cerrar programa");
                    System.out.print("Elige una opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("informacion de usuario");
                            if (usuarios[opcion] != null) {
                                System.out.println("elige usuario"+usuarios[].name);

                            }
                            break;
                        case 2:
                            System.out.println("consultar vuelo");
                            break;
                        case 3:
                            System.out.println("consultar reserva ");
                            break;
                        case 4:
                            System.out.println("cerrar programa");
                    }
                } while (opcion != 4);

                scanner.close();
            }

}}