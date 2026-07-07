package repositories;

import models.Tipologia;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados das tipologias de quarto
 * a partir do ficheiro tipologia.csv.
 */
public class TipologiaRepository {

    private ArrayList<Tipologia> listaTipologias;

    /**
     * Carrega a lista de tipologias a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro tipologia.csv não for encontrado
     */
    public TipologiaRepository() throws FileNotFoundException {
        this.listaTipologias = CsvReader.lerFicheiroCsvTipologia("resources/tipologia.csv");
    }

    /**
     * Devolve a lista de tipologias carregada.
     *
     * @return lista de tipologias
     */
    public ArrayList<Tipologia> getListaTipologias() {
        return listaTipologias;
    }
}