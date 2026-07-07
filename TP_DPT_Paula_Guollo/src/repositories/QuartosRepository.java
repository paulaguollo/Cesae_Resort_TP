package repositories;

import models.Quartos;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados dos quartos
 * a partir do ficheiro quartos.csv.
 */
public class QuartosRepository {

    private ArrayList<Quartos> listaQuartos;

    /**
     * Carrega a lista de quartos a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro quartos.csv não for encontrado
     */
    public QuartosRepository() throws FileNotFoundException {
        this.listaQuartos = CsvReader.lerFicheiroCsvQuartos("resources/quartos.csv");
    }

    /**
     * Devolve a lista de quartos carregada.
     *
     * @return lista de quartos
     */
    public ArrayList<Quartos> getListaQuartos() {
        return listaQuartos;
    }
}