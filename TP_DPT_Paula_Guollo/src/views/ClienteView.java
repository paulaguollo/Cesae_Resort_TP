package views;

import controllers.ClienteController;
import models.Quartos;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu de Cliente (acesso público, sem
 * necessidade de login).
 */
public class ClienteView {

    private ClienteController clienteController;

    /**
     * Cria a view de Cliente e instancia o respetivo controller.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public ClienteView() throws FileNotFoundException {
        this.clienteController = new ClienteController();
    }

    /**
     * Apresenta o menu de Cliente e encaminha para a opção escolhida pelo utilizador.
     */
    public void menuCliente() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+-+-+- MENU CLIENTE -+-+-+-+-+-+-+-+-");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Experiências Disponíveis");
            System.out.println("3. Consultar Experiência Favorita");
            System.out.println("4. Consultar Experiência Top-Seller");
            System.out.println("5. Avaliar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    for (Quartos quartoAtual : this.clienteController.consultarQuartosDisponiveis()) {
                        System.out.println(quartoAtual);
                    }
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
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