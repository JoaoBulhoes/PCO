/**
 * The type Industria.
 */
public class Industria extends Utilizador{
    private int contactoFarmacovigilancia;

    /**
     * Instantiates a new Industria.
     *
     * @param nome                      the nome
     * @param password                  the password
     * @param email                     the email
     * @param contactoFarmacovigilancia the contacto farmacovigilancia
     */
    public Industria(String nome, String password, String email, int contactoFarmacovigilancia) {
        super(nome, password, email);
        this.contactoFarmacovigilancia = contactoFarmacovigilancia;
    }

    /**
     * Criar medicamento.
     */
    public void criarMedicamento() {

    }

    /**
     * Consultar lista medicamentos.
     */
    public void consultarListaMedicamentos() {

    }
}
