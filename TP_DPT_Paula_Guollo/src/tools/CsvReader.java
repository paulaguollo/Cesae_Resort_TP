package tools;

import models.Cliente;
import models.Experiencias;

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
            String[] linhaSeparada = linha.split(";");

            String idAtual = linhaSeparada[0];
            String nomeAtual = linhaSeparada[1];
            String nacionalidadeAtual = linhaSeparada[2];
            String emailAtual = linhaSeparada[3];
            String dataNascimentoAtual = linhaSeparada[4];
            int telemovelAtual = Integer.parseInt(linhaSeparada[5]);
            boolean consentimentoMarketing = Boolean.parseBoolean(linhaSeparada[6]);

            Cliente experiencia = new Cliente(idAtual, nomeAtual, nacionalidadeAtual, emailAtual, telemovelAtual, dataNascimentoAtual, consentimentoMarketing);
            listaClientes.add(experiencia);

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
            String[] linhaSeparada = linha.split(";");

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
}
