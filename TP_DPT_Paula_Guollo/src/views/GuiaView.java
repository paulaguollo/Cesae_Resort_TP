package views;

import controllers.GuiaController;
import models.Experiencias;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu de Guia de Experiência (acesso após
 * login com perfil GUIA).
 */
public class GuiaView {

    private GuiaController guiaController;

    /**
     * Cria a view de Guia e instancia o respetivo controller.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public GuiaView() throws FileNotFoundException {
        this.guiaController = new GuiaController();
    }

    /**
     * Apresenta o menu de Guia e encaminha para a opção escolhida pelo utilizador.
     */
    public void menuGuia() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+-+-+- MENU GUIA -+-+-+-+-+-+-+-+-");
            System.out.println("1. Consultar Histórico de Experiências");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Insira o seu id de guia: ");
                    String idGuia = input.next();

                    for (Experiencias experienciaAtual : this.guiaController.consultarHistoricoExperiencias(idGuia)) {
                        System.out.println(experienciaAtual);
                    }
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