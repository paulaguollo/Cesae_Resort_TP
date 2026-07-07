package controllers;

import models.Experiencias;
import repositories.ExperienciasRepository;
import repositories.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Controller responsável pelas funcionalidades do menu de Guia de Experiência,
 * acessível apenas após login com perfil GUIA.
 */
public class GuiaController {

    private ExperienciasRepository experienciasRepository;
    private VendasRepository vendasRepository;

    /**
     * Cria o controller de Guia e carrega os repositórios necessários.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public GuiaController() throws FileNotFoundException {
        this.experienciasRepository = new ExperienciasRepository();
        this.vendasRepository = new VendasRepository();
    }

    /**
     * Devolve as experiências que são da responsabilidade de um determinado guia.
     *
     * @param idGuia identificador do guia autenticado
     * @return lista das experiências desse guia
     */
    public ArrayList<Experiencias> consultarHistoricoExperiencias(String idGuia) {

        ArrayList<Experiencias> experienciasDoGuia = new ArrayList<Experiencias>();

        for (Experiencias experienciaAtual : this.experienciasRepository.getListaExperiencias()) {
            if (experienciaAtual.getIdGuia().equals(idGuia)) {
                experienciasDoGuia.add(experienciaAtual);
            }
        }

        return experienciasDoGuia;
    }

    /**
     * Conta o número de adultos inscritos numa determinada experiência.
     *
     * @param idExperiencia identificador da experiência
     * @return número total de adultos inscritos
     */
    public int contarAdultosInscritos(String idExperiencia) {
        return 0;
    }

    /**
     * Conta o número de crianças inscritas numa determinada experiência.
     *
     * @param idExperiencia identificador da experiência
     * @return número total de crianças inscritas
     */
    public int contarCriancasInscritas(String idExperiencia) {
        return 0;
    }

    /**
     * Calcula o valor total arrecadado numa determinada experiência
     * (bilhetes de adulto + bilhetes de criança).
     *
     * @param idExperiencia identificador da experiência
     * @return valor total arrecadado
     */
    public double calcularValorTotalArrecadado(String idExperiencia) {
        return 0;
    }
}