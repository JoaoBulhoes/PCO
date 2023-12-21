import java.util.List;

/**
 * The type Utilizador.
 */
public class Utilizador {
    private String nome;
    private String password;
    private String email;

    /**
     * Instantiates a new Utilizador.
     *
     * @param nome     the nome
     * @param password the password
     * @param email    the email
     */
    public Utilizador(String nome, String password, String email) {
        this.nome = nome;
        this.password = password;
        this.email = email;
    }

    /**
     * Iniciar login.
     */
    public void iniciarLogin() {

    }

    /**
     * Indicar dados.
     *
     * @param nome     the nome
     * @param password the password
     */
    public void indicarDados(String nome, String password) {

    }

    /**
     * Consultar lista substancias.
     */
    public void consultarListaSubstancias() {

    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
