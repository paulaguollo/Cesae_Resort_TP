package repositories;

import models.Login;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados das contas de login do sistema
 * a partir do ficheiro logins.csv.
 */
public class LoginRepository {

    private ArrayList<Login> listaLogins;

    /**
     * Carrega a lista de logins a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro logins.csv não for encontrado
     */
    public LoginRepository() throws FileNotFoundException {
        this.listaLogins = CsvReader.lerFicheiroCsvLogins("resources/logins.csv");
    }

    /**
     * Devolve a lista de logins carregada.
     *
     * @return lista de logins
     */
    public ArrayList<Login> getListaLogins() {
        return listaLogins;
    }
}