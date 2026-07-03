package models;

public class Quartos {
    private int numQuarto;
    private int idTipologia;

    public Quartos(int numQuarto, int idTipologia) {
        this.numQuarto = numQuarto;
        this.idTipologia = idTipologia;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public int getIdTipologia() {
        return idTipologia;
    }

    @Override
    public String toString() {
        return "Quartos{" +
                "numQuarto=" + numQuarto +
                ", idTipologia=" + idTipologia +
                '}';
    }
}
