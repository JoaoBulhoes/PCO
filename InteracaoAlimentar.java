import java.util.ArrayList;
import java.util.List;

/**
 * The type Interacao alimentar.
 */
public class InteracaoAlimentar {
    private String nome;
    private String explicacao;
    private String efeito;
    private String referencia;
    private List<Alimento> alimentos = new ArrayList<>();

    /**
     * Instantiates a new Interacao alimentar.
     *
     * @param nome       the nome
     * @param explicacao the explicacao
     * @param efeito     the efeito
     * @param referencia the referencia
     * @param alimentos  the alimentos
     */
    public InteracaoAlimentar(String nome, String explicacao, String efeito, String referencia, List<Alimento> alimentos) {
        this.nome = nome;
        this.explicacao = explicacao;
        this.efeito = efeito;
        this.referencia = referencia;
        this.alimentos = alimentos;
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
     * Gets explicacao.
     *
     * @return the explicacao
     */
    public String getExplicacao() {
        return explicacao;
    }

    /**
     * Sets explicacao.
     *
     * @param explicacao the explicacao
     */
    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }

    /**
     * Gets efeito.
     *
     * @return the efeito
     */
    public String getEfeito() {
        return efeito;
    }

    /**
     * Sets efeito.
     *
     * @param efeito the efeito
     */
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    /**
     * Gets alimentos.
     *
     * @return the alimentos
     */
    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    /**
     * Sets alimento.
     *
     * @param alimentos the alimentos
     */
    public void setAlimento(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
}
