package views;

import controllers.RececionistaController;
import models.Reservas;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu de Rececionista (acesso após login
 * com perfil GESTAO).
 */
public class RececionistaView {

    private RececionistaController rececionistaController;

    /**
     * Cria a view de Rececionista e instancia o respetivo controller.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public RececionistaView() throws FileNotFoundException {
        this.rececionistaController = new RececionistaController();
    }

    /**
     * Apresenta o menu de Rececionista e encaminha para a opção escolhida pelo utilizador.
     */
    public void menuRececionista() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+-+-+- MENU RECECIONISTA -+-+-+-+-+-+-+-+-");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Quartos Reservados");
            System.out.println("3. Consultar Reservas Atuais");
            System.out.println("4. Efetuar uma Reserva");
            System.out.println("5. Reservar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    break;

                case 2:
                    for (Reservas reservaAtual : this.rececionistaController.consultarQuartosReservados()) {
                        System.out.println(reservaAtual);
                    }
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