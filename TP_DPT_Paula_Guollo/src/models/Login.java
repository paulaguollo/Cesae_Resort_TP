package models;

public class Login {
    private String username;
    private String password;
    private String tipoAcesso;

    public Login(String username, String password, String tipoAcesso) {
        this.username = username;
        this.password = password;
        this.tipoAcesso = tipoAcesso;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tipoAcesso='" + tipoAcesso + '\'' +
                '}';
    }
}
