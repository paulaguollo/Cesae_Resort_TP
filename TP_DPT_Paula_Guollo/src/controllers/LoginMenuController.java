package controllers;

import models.Login;
import repositories.LoginRepository;

import java.io.FileNotFoundException;

/**
 * Controller responsável por validar as credenciais de login e devolver
 * o tipo de acesso (ADMIN, GESTAO ou GUIA) do utilizador autenticado.
 */
public class LoginMenuController {

    private LoginRepository loginRepository;

    /**
     * Cria o controller de login e carrega o repositório de logins.
     *
     * @throws FileNotFoundException se o ficheiro logins.csv não for encontrado
     */
    public LoginMenuController() throws FileNotFoundException {
        this.loginRepository = new LoginRepository();
    }

    /**
     * Valida as credenciais introduzidas comparando com os logins carregados.
     *
     * @param usernameIntroduzido username introduzido pelo utilizador
     * @param passwordIntroduzida password introduzida pelo utilizador
     * @return o tipo de acesso (ADMIN, GESTAO ou GUIA) se as credenciais forem válidas, ou "ERRO" caso contrário
     */
    public String validarLogin(String usernameIntroduzido, String passwordIntroduzida) {

        for (Login loginAtual : this.loginRepository.getListaLogins()) {
            if (loginAtual.getUsername().equals(usernameIntroduzido) && loginAtual.getPassword().equals(passwordIntroduzida)) {
                return loginAtual.getTipoAcesso();
            }
        }
        return "ERRO";
    }
}