package models;

public class Experiencias {
    private String id;
    private String nome;
    private String idGuia;
    private int precoAdulto;
    private int precoCrianca;

    public Experiencias(String id, String nome, String idGuia, int precoAdulto, int precoCrianca) {
        this.id = id;
        this.nome = nome;
        this.idGuia = idGuia;
        this.precoAdulto = precoAdulto;
        this.precoCrianca = precoCrianca;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPrecoCrianca() {
        return precoCrianca;
    }

    public int getPrecoAdulto() {
        return precoAdulto;
    }

    public String getIdGuia() {
        return idGuia;
    }

    @Override
    public String toString() {
        return "Experiencias{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idGuia='" + idGuia + '\'' +
                ", precoAdulto=" + precoAdulto +
                ", precoCrianca=" + precoCrianca +
                '}';
    }
}
