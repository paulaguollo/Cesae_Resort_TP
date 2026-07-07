package controllers;

import models.Experiencias;
import models.Quartos;
import repositories.ExperienciasRepository;
import repositories.GuiaRepository;
import repositories.QuartosRepository;
import repositories.RatingExperienciasRepository;
import repositories.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Controller responsável pelas funcionalidades do menu de Cliente,
 * acessível sem necessidade de login.
 */
public class ClienteController {

    private QuartosRepository quartosRepository;
    private ExperienciasRepository experienciasRepository;
    private GuiaRepository guiaRepository;
    private RatingExperienciasRepository ratingExperienciasRepository;
    private VendasRepository vendasRepository;

    /**
     * Cria o controller de Cliente e carrega os repositórios necessários.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public ClienteController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.guiaRepository = new GuiaRepository();
        this.ratingExperienciasRepository = new RatingExperienciasRepository();
        this.vendasRepository = new VendasRepository();
    }

    /**
     * Devolve a lista de quartos disponíveis (num_quarto, tipologia, preco_por_semana).
     *
     * @return lista de quartos
     */
    public ArrayList<Quartos> consultarQuartosDisponiveis() {
        return this.quartosRepository.getListaQuartos();
    }

    /**
     * Devolve a lista de experiências disponíveis, com nome, rating_experiencia,
     * nome do guia, rating_guia, preco_adulto e preco_crianca.
     *
     * @return lista de experiências disponíveis
     */
    public ArrayList<Experiencias> consultarExperienciasDisponiveis() {
        return null;
    }

    /**
     * Devolve a experiência com melhor rating (experiência favorita).
     *
     * @return a experiência favorita
     */
    public Experiencias consultarExperienciaFavorita() {
        return null;
    }

    /**
     * Devolve a experiência com mais bilhetes vendidos (top-seller).
     *
     * @return a experiência top-seller
     */
    public Experiencias consultarExperienciaTopSeller() {
        return null;
    }

    /**
     * Regista a avaliação (rating) de uma experiência e do respetivo guia.
     *
     * @param idExperiencia     identificador da experiência a avaliar
     * @param ratingExperiencia rating atribuído à experiência
     * @param ratingGuia        rating atribuído ao guia
     */
    public void avaliarExperiencia(String idExperiencia, int ratingExperiencia, int ratingGuia) {
    }
}