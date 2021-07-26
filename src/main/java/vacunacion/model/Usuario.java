package vacunacion.model;

public class Usuario {
    public String username;
    public String password;

    public Usuario(String username) {
        this.username = username;
        this.password = StringFormatter.reverseString(username);
    }
}
