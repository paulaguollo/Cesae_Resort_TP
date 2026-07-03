package models;

public class Guia {
    private String id;
    private String nome;
    private String nacionalidade;
    private String email;
    private int telemovel;

    public Guia(String id, String nome, String nacionalidade, String email, int telemovel) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return telemovel;
    }

    @Override
    public String toString() {
        return "Guia{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", email='" + email + '\'' +
                ", telemovel=" + telemovel +
                '}';
    }
}
