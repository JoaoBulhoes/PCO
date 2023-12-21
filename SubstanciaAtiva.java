import java.util.ArrayList;
import java.util.List;

/**
 * The type Substancia ativa.
 */
public class SubstanciaAtiva {
    private String nome;
    private List<InteracaoAlimentar> interacoes = new ArrayList<>();

    /**
     * Instantiates a new Substancia ativa.
     *
     * @param nome       the nome
     * @param interacoes the interacoes
     */
    public SubstanciaAtiva(String nome, List<InteracaoAlimentar> interacoes) {
        this.nome = nome;
        this.interacoes = interacoes;
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
     * Gets interacoes.
     *
     * @return the interacoes
     */
    public List<InteracaoAlimentar> getInteracoes() {
        return interacoes;
    }

    /**
     * Sets interacoes.
     *
     * @param interacoes the interacoes
     */
    public void setInteracoes(List<InteracaoAlimentar> interacoes) {
        this.interacoes = interacoes;
    }
}
