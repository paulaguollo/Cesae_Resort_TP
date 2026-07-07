package repositories;

import models.Guia;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados dos guias de experiência
 * a partir do ficheiro guias_experiencias.csv.
 */
public class GuiaRepository {

    private ArrayList<Guia> listaGuias;

    /**
     * Carrega a lista de guias a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro guias_experiencias.csv não for encontrado
     */
    public GuiaRepository() throws FileNotFoundException {
        this.listaGuias = CsvReader.lerFicheiroCsvGuias("resources/guias_experiencias.csv");
    }

    /**
     * Devolve a lista de guias carregada.
     *
     * @return lista de guias
     */
    public ArrayList<Guia> getListaGuias() {
        return listaGuias;
    }
}