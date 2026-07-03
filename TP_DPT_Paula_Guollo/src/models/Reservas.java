package models;

public class Reservas {
    private String id;
    private int numQuarto;
    private String idCliente;
    private int ano;
    private int mes;
    private int semana;

    public Reservas(String id, int numQuarto, int ano, String idCliente, int mes, int semana) {
        this.id = id;
        this.numQuarto = numQuarto;
        this.ano = ano;
        this.idCliente = idCliente;
        this.mes = mes;
        this.semana = semana;
    }

    public String getId() {
        return id;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getSemana() {
        return semana;
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "id='" + id + '\'' +
                ", numQuarto=" + numQuarto +
                ", idCliente='" + idCliente + '\'' +
                ", ano=" + ano +
                ", mes=" + mes +
                ", semana=" + semana +
                '}';
    }
}
