package repositories;

import models.RatingExperiencias;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados dos ratings de experiências e guias
 * a partir do ficheiro ratings_experiencias.csv.
 */
public class RatingExperienciasRepository {

    private ArrayList<RatingExperiencias> listaRatings;

    /**
     * Carrega a lista de ratings a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro ratings_experiencias.csv não for encontrado
     */
    public RatingExperienciasRepository() throws FileNotFoundException {
        this.listaRatings = CsvReader.lerFicheiroCsvRatingsExperiencias("resources/ratings_experiencias.csv");
    }

    /**
     * Devolve a lista de ratings carregada.
     *
     * @return lista de ratings
     */
    public ArrayList<RatingExperiencias> getListaRatings() {
        return listaRatings;
    }
}