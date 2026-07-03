package models;

public class RatingExperiencias {
    private String id;
    private String idExperiencia;
    private int ratingExperiencia;
    private int ratingGuia;

    public RatingExperiencias(String id, String idExperiencia, int ratingExperiencia, int ratingGuia) {
        this.id = id;
        this.idExperiencia = idExperiencia;
        this.ratingExperiencia = ratingExperiencia;
        this.ratingGuia = ratingGuia;
    }

    public String getId() {
        return id;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public int getRatingExperiencia() {
        return ratingExperiencia;
    }

    public int getRatingGuia() {
        return ratingGuia;
    }

    @Override
    public String toString() {
        return "RatingExperiencias{" +
                "id='" + id + '\'' +
                ", idExperiencia='" + idExperiencia + '\'' +
                ", ratingExperiencia=" + ratingExperiencia +
                ", ratingGuia=" + ratingGuia +
                '}';
    }
}
