package views;

import controllers.AdministradorController;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu de Administrador (acesso após login
 * com perfil ADMIN).
 */
public class AdministradorView {

    private AdministradorController administradorController;

    /**
     * Cria a view de Administrador e instancia o respetivo controller.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public AdministradorView() throws FileNotFoundException {
        this.administradorController = new AdministradorController();
    }

    /**
     * Apresenta o menu de Administrador e encaminha para a opção escolhida pelo utilizador.
     */
    public void menuAdministrador() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+-+-+- MENU ADMINISTRADOR -+-+-+-+-+-+-+-+-");
            System.out.println("1. Consultar Total de Reservas");
            System.out.println("2. Consultar Total de Receitas");
            System.out.println("3. Consultar Reservas/Receitas Mensais");
            System.out.println("4. Consultar Tipologia de Quarto Mais Reservada");
            System.out.println("5. Consultar Experiência Mais Procurada (Adultos)");
            System.out.println("6. Consultar Experiência Mais Procurada (Crianças)");
            System.out.println("7. Consultar Experiência Mais Lucrativa");
            System.out.println("8. Consultar Experiência Menos Lucrativa");
            System.out.println("9. Consultar Quarto com Melhor Preço/Semana");
            System.out.println("10. Adicionar Novo Login");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    input.nextLine();

                    System.out.print("Username: ");
                    String username = input.nextLine();

                    System.out.print("Password: ");
                    String password = input.nextLine();

                    System.out.print("Tipo de acesso (ADMIN, GESTAO ou GUIA): ");
                    String tipoAcesso = input.nextLine();

                    this.administradorController.adicionarNovoLogin(username, password, tipoAcesso);
                    System.out.println("Login adicionado com sucesso.");
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
}