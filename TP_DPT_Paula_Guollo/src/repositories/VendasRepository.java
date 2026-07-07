package repositories;

import models.Vendas;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados das vendas de bilhetes de experiências
 * a partir do ficheiro vendas_experiencias.csv.
 */
public class VendasRepository {

    private ArrayList<Vendas> listaVendas;

    /**
     * Carrega a lista de vendas a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro vendas_experiencias.csv não for encontrado
     */
    public VendasRepository() throws FileNotFoundException {
        this.listaVendas = CsvReader.lerFicheiroCsvVendas("resources/vendas_experiencias.csv");
    }

    /**
     * Devolve a lista de vendas carregada.
     *
     * @return lista de vendas
     */
    public ArrayList<Vendas> getListaVendas() {
        return listaVendas;
    }
}