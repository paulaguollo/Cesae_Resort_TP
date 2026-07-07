package repositories;

import models.Reservas;
import tools.CsvReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por carregar os dados das reservas de quarto
 * a partir do ficheiro reservas_quartos.csv.
 */
public class ReservasRepository {

    private ArrayList<Reservas> listaReservas;

    /**
     * Carrega a lista de reservas a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro reservas_quartos.csv não for encontrado
     */
    public ReservasRepository() throws FileNotFoundException {
        this.listaReservas = CsvReader.lerFicheiroCsvReservas("resources/reservas_quartos.csv");
    }

    /**
     * Devolve a lista de reservas carregada.
     *
     * @return lista de reservas
     */
    public ArrayList<Reservas> getListaReservas() {
        return listaReservas;
    }
}