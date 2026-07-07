package controllers;

import models.Quartos;
import models.Reservas;
import repositories.ClienteRepository;
import repositories.ExperienciasRepository;
import repositories.QuartosRepository;
import repositories.ReservasRepository;
import repositories.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Controller responsável pelas funcionalidades do menu de Rececionista,
 * acessível apenas após login com perfil GESTAO.
 */
public class RececionistaController {

    private QuartosRepository quartosRepository;
    private ReservasRepository reservasRepository;
    private ClienteRepository clienteRepository;
    private ExperienciasRepository experienciasRepository;
    private VendasRepository vendasRepository;

    /**
     * Cria o controller de Rececionista e carrega os repositórios necessários.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public RececionistaController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.reservasRepository = new ReservasRepository();
        this.clienteRepository = new ClienteRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.vendasRepository = new VendasRepository();
    }

    /**
     * Devolve a lista de quartos disponíveis na semana atual, com num_quarto,
     * tipologia e preco_por_semana.
     *
     * @return lista de quartos disponíveis na semana atual
     */
    public ArrayList<Quartos> consultarQuartosDisponiveis() {
        return null;
    }

    /**
     * Devolve a lista de quartos reservados, com num_quarto, tipologia, idCliente,
     * nome, email, nacionalidade, ano, mês e semana.
     *
     * @return lista de reservas de quarto existentes
     */
    public ArrayList<Reservas> consultarQuartosReservados() {
        return this.reservasRepository.getListaReservas();
    }

    /**
     * Devolve a lista de reservas da semana atual, com num_quarto, tipologia,
     * idCliente, nome, email e nacionalidade.
     *
     * @return lista de reservas atuais (semana atual)
     */
    public ArrayList<Reservas> consultarReservasAtuais() {
        return null;
    }

    /**
     * Verifica a disponibilidade do quarto e, se possível, efetua a reserva.
     *
     * @param idCliente identificador do cliente
     * @param numQuarto número do quarto a reservar
     * @param ano       ano da reserva
     * @param mes       mês da reserva
     * @param semana    semana da reserva
     * @return true se a reserva foi efetuada com sucesso, false caso contrário
     */
    public boolean efetuarReserva(String idCliente, int numQuarto, int ano, int mes, int semana) {
        return false;
    }

    /**
     * Efetua a reserva de uma experiência associada a uma reserva de quarto existente.
     *
     * @param idCliente   identificador do cliente
     * @param idReserva   identificador da reserva de quarto
     * @param numAdultos  número de adultos inscritos
     * @param numCriancas número de crianças inscritas
     * @return true se a reserva da experiência foi efetuada com sucesso, false caso contrário
     */
    public boolean reservarExperiencia(String idCliente, String idReserva, int numAdultos, int numCriancas) {
        return false;
    }
}