package controllers;

import models.Experiencias;
import models.Login;
import models.Quartos;
import models.Tipologia;
import repositories.ExperienciasRepository;
import repositories.LoginRepository;
import repositories.QuartosRepository;
import repositories.ReservasRepository;
import repositories.TipologiaRepository;
import repositories.VendasRepository;

import java.io.FileNotFoundException;

/**
 * Controller responsável pelas funcionalidades do menu de Administrador,
 * acessível apenas após login com perfil ADMIN.
 */
public class AdministradorController {

    private ReservasRepository reservasRepository;
    private QuartosRepository quartosRepository;
    private TipologiaRepository tipologiaRepository;
    private ExperienciasRepository experienciasRepository;
    private VendasRepository vendasRepository;
    private LoginRepository loginRepository;

    /**
     * Cria o controller de Administrador e carrega os repositórios necessários.
     *
     * @throws FileNotFoundException se algum dos ficheiros CSV não for encontrado
     */
    public AdministradorController() throws FileNotFoundException {
        this.reservasRepository = new ReservasRepository();
        this.quartosRepository = new QuartosRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.vendasRepository = new VendasRepository();
        this.loginRepository = new LoginRepository();
    }

    /**
     * Consulta as receitas de um determinado mês/ano.
     *
     * @param ano ano a consultar
     * @param mes mês a consultar
     * @return valor total de receitas do mês indicado
     */
    public double consultarReceitasMensais(int ano, int mes) {
        return 0;
    }

    /**
     * Consulta a tipologia de quarto mais reservada.
     *
     * @return a tipologia mais reservada
     */
    public Tipologia consultarTipologiaMaisReservada() {
        return null;
    }

    /**
     * Consulta a experiência mais procurada por adultos (número de bilhetes vendidos).
     *
     * @return a experiência mais procurada por adultos
     */
    public Experiencias consultarExperienciaMaisProcuradaAdultos() {
        return null;
    }

    /**
     * Consulta a experiência mais procurada por crianças (número de bilhetes vendidos).
     *
     * @return a experiência mais procurada por crianças
     */
    public Experiencias consultarExperienciaMaisProcuradaCriancas() {
        return null;
    }

    /**
     * Consulta a experiência mais lucrativa (maior valor total arrecadado).
     *
     * @return a experiência mais lucrativa
     */
    public Experiencias consultarExperienciaMaisLucrativa() {
        return null;
    }

    /**
     * Consulta a experiência menos lucrativa (menor valor total arrecadado).
     *
     * @return a experiência menos lucrativa
     */
    public Experiencias consultarExperienciaMenosLucrativa() {
        return null;
    }

    /**
     * Consulta o quarto com o melhor (maior) preço por semana, cruzando cada
     * quarto com a sua tipologia para obter o preço.
     *
     * @return o quarto com melhor preço/semana
     */
    public Quartos consultarQuartoMelhorPreco() {

        Quartos quartoComMelhorPreco = null;
        int melhorPreco = -1;

        for (Quartos quartoAtual : this.quartosRepository.getListaQuartos()) {

            for (Tipologia tipologiaAtual : this.tipologiaRepository.getListaTipologias()) {

                if (tipologiaAtual.getId() == quartoAtual.getIdTipologia()) {

                    if (tipologiaAtual.getPrecoSemana() > melhorPreco) {
                        melhorPreco = tipologiaAtual.getPrecoSemana();
                        quartoComMelhorPreco = quartoAtual;
                    }
                }
            }
        }

        return quartoComMelhorPreco;
    }

    /**
     * Adiciona um novo login ao sistema.
     *
     * @param username   nome de utilizador
     * @param password   palavra-passe
     * @param tipoAcesso tipo de acesso (ADMIN, GESTAO ou GUIA)
     */
    public void adicionarNovoLogin(String username, String password, String tipoAcesso) {
    }
}