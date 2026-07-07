package repositories;

import models.Cliente;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados dos clientes
 * a partir do ficheiro clientes.csv.
 */
public class ClienteRepository {

    private ArrayList<Cliente> listaClientes;

    /**
     * Carrega a lista de clientes a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro clientes.csv não for encontrado
     */
    public ClienteRepository() throws FileNotFoundException {
        this.listaClientes = CsvReader.lerFicheiroCsvClientes("resources/clientes.csv");
    }

    /**
     * Devolve a lista de clientes carregada.
     *
     * @return lista de clientes
     */
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
}