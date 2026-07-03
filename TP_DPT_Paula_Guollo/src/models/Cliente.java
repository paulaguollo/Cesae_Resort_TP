package models;

public class Cliente {
    private String id;
    private String nome;
    private String nacionalidade;
    private String email;
    private int telemovel;
    private String dataNascimento;
    private boolean consentimentoMarketing;

    public Cliente(String id, String nome, String nacionalidade, String email, int telemovel, String dataNascimento, boolean consentimentoMarketing) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.telemovel = telemovel;
        this.dataNascimento = dataNascimento;
        this.consentimentoMarketing = consentimentoMarketing;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public boolean isConsentimentoMarketing() {
        return consentimentoMarketing;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", email='" + email + '\'' +
                ", telemovel=" + telemovel +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", consentimentoMarketing=" + consentimentoMarketing +
                '}';
    }
}
