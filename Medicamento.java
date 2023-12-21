import java.util.ArrayList;
import java.util.List;

/**
 * The type Medicamento.
 */
public class Medicamento {
    private String nome;
    private String formaFarmaceutica;
    private String dosagem;
    private List<SubstanciaAtiva> substancias = new ArrayList<>();

    /**
     * Instantiates a new Medicamento.
     *
     * @param nome              the nome
     * @param formaFarmaceutica the forma farmaceutica
     * @param dosagem           the dosagem
     * @param substancias       the substancias
     */
    public Medicamento(String nome, String formaFarmaceutica, String dosagem, List<SubstanciaAtiva> substancias) {
        this.nome = nome;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosagem = dosagem;
        this.substancias = substancias;
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
     * Gets forma farmaceutica.
     *
     * @return the forma farmaceutica
     */
    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    /**
     * Sets forma farmaceutica.
     *
     * @param formaFarmaceutica the forma farmaceutica
     */
    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    /**
     * Gets dosagem.
     *
     * @return the dosagem
     */
    public String getDosagem() {
        return dosagem;
    }

    /**
     * Sets dosagem.
     *
     * @param dosagem the dosagem
     */
    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    /**
     * Gets substancias.
     *
     * @return the substancias
     */
    public List<SubstanciaAtiva> getSubstancias() {
        return substancias;
    }

    /**
     * Sets substancias.
     *
     * @param substancias the substancias
     */
    public void setSubstancias(List<SubstanciaAtiva> substancias) {
        this.substancias = substancias;
    }
}
