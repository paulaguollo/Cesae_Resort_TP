package views;

import controllers.LoginMenuController;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu inicial (Cliente ou Login) e o
 * formulário de login, encaminhando o utilizador autenticado para o menu
 * correspondente ao seu tipo de acesso (ADMIN, GESTAO ou GUIA).
 */
public class LoginMenuView {

    private LoginMenuController loginMenuController;

    /**
     * Cria a view de Login e instancia o respetivo controller.
     *
     * @throws FileNotFoundException se o ficheiro logins.csv não for encontrado
     */
    public LoginMenuView() throws FileNotFoundException {
        this.loginMenuController = new LoginMenuController();
    }

    /**
     * Apresenta o menu inicial, permitindo escolher entre aceder como Cliente
     * (sem login) ou efetuar login (Administrador, Rececionista ou Guia).
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public void mostrarMenuInicial() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+-+-+- CESAE RESORT -+-+-+-+-+-+-+-+-");
            System.out.println("1. Acesso Cliente");
            System.out.println("2. Login");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    ClienteView clienteView = new ClienteView();
                    clienteView.menuCliente();
                    break;

                case 2:
                    menuLogin();
                    break;

                case 0:
                    System.out.println("Sair...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    /**
     * Pede o username e a password ao utilizador e tenta autenticá-lo,
     * encaminhando-o de seguida para o menu correspondente ao seu tipo de acesso.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public void menuLogin() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("\n-+-+-+-+-+-+-+-+- LOGIN -+-+-+-+-+-+-+-+-");

        System.out.print("Username: ");
        String username = input.next();

        System.out.print("Password: ");
        String password = input.next();

        String tipoAcesso = this.loginMenuController.validarLogin(username, password);

        switch (tipoAcesso) {

            case "ADMIN":
                System.out.println("Login feito como Administrador.");
                AdministradorView administradorView = new AdministradorView();
                administradorView.menuAdministrador();
                break;

            case "GESTAO":
                System.out.println("Login feito como Rececionista.");
                RececionistaView rececionistaView = new RececionistaView();
                rececionistaView.menuRececionista();
                break;

            case "GUIA":
                System.out.println("Login feito como Guia de Experiência.");
                GuiaView guiaView = new GuiaView();
                guiaView.menuGuia();
                break;

            case "ERRO":
                System.out.println("Username ou password inválidos.");
                break;

            default:
                System.out.println("Tipo de conta desconhecido.");
                break;
        }
    }
}