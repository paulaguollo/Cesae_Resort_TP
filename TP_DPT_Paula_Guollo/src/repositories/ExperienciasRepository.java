package repositories;

import models.Experiencias;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados das experiências
 * a partir do ficheiro experiencias.csv.
 */
public class ExperienciasRepository {

    private ArrayList<Experiencias> listaExperiencias;

    /**
     * Carrega a lista de experiências a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro experiencias.csv não for encontrado
     */
    public ExperienciasRepository() throws FileNotFoundException {
        this.listaExperiencias = CsvReader.lerFicheiroCsvExperiencias("resources/experiencias.csv");
    }

    /**
     * Devolve a lista de experiências carregada.
     *
     * @return lista de experiências
     */
    public ArrayList<Experiencias> getListaExperiencias() {
        return listaExperiencias;
    }
}