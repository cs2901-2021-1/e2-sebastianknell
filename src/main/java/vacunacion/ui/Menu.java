package vacunacion.ui;

import vacunacion.controller.LoginController;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    void print(String msg) {
        System.out.println(msg);
    }

    void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void printOptions1() {
        print("1. Avance de la vacunacion");
        print("2. Cobertura de la vacunacion");
        print("3. Numeros de centros de vacunacion");
        print("4. Número de personas vacunadas parcialmente");
        print("5. Número de personas vacunadas completamente");
    }

    public void execute() {
        boolean validLogin;
        do {
            print("Iniciar sesion: Ingresa tu usuario y contraseña");
            print("Usuario: ");
            String username = scanner.nextLine();
            print("Usuario: ");
            String password = scanner.nextLine();
            validLogin = LoginController.login(username, password);
        } while (!validLogin);

        clear();

        int option;
        do {
            print("1. Administrar centos de vacunacion");
            print("2. Obtener informacion");
            option = scanner.nextInt();
        } while (option != 2 && option != 1);

        switch (option) {
            case 1:
                print("1. Dar de alta a un centro de vacunacion");
                print("2. Dar de baja a un centro de vacunacion");
                break;
            case 2:
                printOptions1();
            default:
                print("Ocurrio un error");
        }

    }
}
