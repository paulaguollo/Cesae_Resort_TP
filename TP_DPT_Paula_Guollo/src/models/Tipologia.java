package models;

public class Tipologia {
    private int id;
    private String descricao;
    private int precoSemana;

    public Tipologia(int id, String descricao, int precoSemana) {
        this.id = id;
        this.descricao = descricao;
        this.precoSemana = precoSemana;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrecoSemana() {
        return precoSemana;
    }

    @Override
    public String toString() {
        return "Tipologia{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", precoSemana=" + precoSemana +
                '}';
    }
}
