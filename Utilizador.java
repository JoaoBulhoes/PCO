/**
 * The type Utilizador.
 */
public class Utilizador {
    private String nome;
    private String password;
    private String email;
    private String role;

    public Utilizador(String nome, String password, String email, String role) {
        this.nome = nome;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }
}
