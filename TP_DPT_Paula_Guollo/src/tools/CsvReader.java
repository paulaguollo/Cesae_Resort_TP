package tools;

import models.Cliente;
import models.Experiencias;
import models.Guia;
import models.Quartos;
import models.Tipologia;
import models.Reservas;
import models.RatingExperiencias;
import models.Vendas;
import models.Login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {

    public static ArrayList<Cliente> lerFicheiroCsvClientes(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String idAtual = linhaSeparada[0];
            String nomeAtual = linhaSeparada[1];
            String nacionalidadeAtual = linhaSeparada[2];
            String emailAtual = linhaSeparada[3];
            int telemovelAtual = Integer.parseInt(linhaSeparada[4]);
            String dataNascimentoAtual = linhaSeparada[5];
            boolean consentimentoMarketing = Boolean.parseBoolean(linhaSeparada[6]);

            Cliente cliente = new Cliente(idAtual, nomeAtual, nacionalidadeAtual, emailAtual, telemovelAtual, dataNascimentoAtual, consentimentoMarketing);
            listaClientes.add(cliente);

        }

        return listaClientes;
    }

    public static ArrayList<Experiencias> lerFicheiroCsvExperiencias(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Experiencias> listaExperiencias = new ArrayList<Experiencias>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String idAtual = linhaSeparada[0];
            String nomeAtual = linhaSeparada[1];
            String idGuiaAtual = linhaSeparada[2];
            int precoAdultoAtual = Integer.parseInt(linhaSeparada[3]);
            int precoCriancaAtual = Integer.parseInt(linhaSeparada[4]);

            Experiencias experiencia = new Experiencias(idAtual, nomeAtual, idGuiaAtual, precoAdultoAtual, precoCriancaAtual);
            listaExperiencias.add(experiencia);

        }

        return listaExperiencias;
    }

    public static ArrayList<Guia> lerFicheiroCsvGuias(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Guia> listaGuias = new ArrayList<Guia>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String idAtual = linhaSeparada[0];
            String nomeAtual = linhaSeparada[1];
            String nacionalidadeAtual = linhaSeparada[2];
            String emailAtual = linhaSeparada[3];
            int telemovelAtual = Integer.parseInt(linhaSeparada[4]);

            Guia guia = new Guia(idAtual, nomeAtual, nacionalidadeAtual, emailAtual, telemovelAtual);
            listaGuias.add(guia);

        }

        return listaGuias;
    }

    public static ArrayList<Quartos> lerFicheiroCsvQuartos(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Quartos> listaQuartos = new ArrayList<Quartos>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            int numQuartoAtual = Integer.parseInt(linhaSeparada[0]);
            int idTipologiaAtual = Integer.parseInt(linhaSeparada[1]);

            Quartos quarto = new Quartos(numQuartoAtual, idTipologiaAtual);
            listaQuartos.add(quarto);

        }

        return listaQuartos;
    }

    public static ArrayList<Tipologia> lerFicheiroCsvTipologia(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Tipologia> listaTipologias = new ArrayList<Tipologia>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            int idAtual = Integer.parseInt(linhaSeparada[0]);
            String descricaoAtual = linhaSeparada[1];
            int precoSemanaAtual = Integer.parseInt(linhaSeparada[2]);

            Tipologia tipologia = new Tipologia(idAtual, descricaoAtual, precoSemanaAtual);
            listaTipologias.add(tipologia);

        }

        return listaTipologias;
    }

    public static ArrayList<Reservas> lerFicheiroCsvReservas(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Reservas> listaReservas = new ArrayList<Reservas>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String idAtual = linhaSeparada[0];
            int numQuartoAtual = Integer.parseInt(linhaSeparada[1]);
            String idClienteAtual = linhaSeparada[2];
            int anoAtual = Integer.parseInt(linhaSeparada[3]);
            int mesAtual = Integer.parseInt(linhaSeparada[4]);
            int semanaAtual = Integer.parseInt(linhaSeparada[5]);

            Reservas reserva = new Reservas(idAtual, numQuartoAtual, anoAtual, idClienteAtual, mesAtual, semanaAtual);
            listaReservas.add(reserva);

        }

        return listaReservas;
    }

    public static ArrayList<RatingExperiencias> lerFicheiroCsvRatingsExperiencias(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<RatingExperiencias> listaRatings = new ArrayList<RatingExperiencias>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String idAtual = linhaSeparada[0];
            String idExperienciaAtual = linhaSeparada[1];
            int ratingExperienciaAtual = Integer.parseInt(linhaSeparada[2]);
            int ratingGuiaAtual = Integer.parseInt(linhaSeparada[3]);

            RatingExperiencias rating = new RatingExperiencias(idAtual, idExperienciaAtual, ratingExperienciaAtual, ratingGuiaAtual);
            listaRatings.add(rating);

        }

        return listaRatings;
    }

    public static ArrayList<Vendas> lerFicheiroCsvVendas(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String idAtual = linhaSeparada[0];
            String idExperienciaAtual = linhaSeparada[1];
            String tipoClienteAtual = linhaSeparada[2];
            int anoAtual = Integer.parseInt(linhaSeparada[3]);
            int mesAtual = Integer.parseInt(linhaSeparada[4]);

            Vendas venda = new Vendas(idAtual, idExperienciaAtual, tipoClienteAtual, anoAtual, mesAtual);
            listaVendas.add(venda);

        }

        return listaVendas;
    }

    public static ArrayList<Login> lerFicheiroCsvLogins(String filePath) throws FileNotFoundException {

        File ficheiro = new File(filePath);
        Scanner fileScanner = new Scanner(ficheiro);

        ArrayList<Login> listaLogins = new ArrayList<Login>();

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String linha = fileScanner.nextLine();
            String[] linhaSeparada = linha.split(",");

            String usernameAtual = linhaSeparada[0];
            String passwordAtual = linhaSeparada[1];
            String tipoAcessoAtual = linhaSeparada[2];

            Login login = new Login(usernameAtual, passwordAtual, tipoAcessoAtual);
            listaLogins.add(login);

        }

        return listaLogins;
    }
}