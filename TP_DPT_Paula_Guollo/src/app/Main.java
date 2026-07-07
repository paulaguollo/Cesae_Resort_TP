package app;

import views.LoginMenuView;

import java.io.FileNotFoundException;

/**
 * Classe principal da aplicação CESAE Resort. Responsável por iniciar
 * o menu inicial da aplicação.
 */
public class Main {

    /**
     * Ponto de entrada da aplicação.
     *
     * @param args argumentos da linha de comandos (não utilizados)
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public static void main(String[] args) throws FileNotFoundException {

        LoginMenuView loginMenuView = new LoginMenuView();
        loginMenuView.mostrarMenuInicial();

    }
}