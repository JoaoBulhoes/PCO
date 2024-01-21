import java.util.List;

/**
 * The type Substancia ativa.
 */
public class Substance {
    private String Substance;

    public Substance(String substance) {
        this.Substance = substance;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getSubstance() {
        return Substance;
    }

    /**
     * Sets nome.
     *
     * @param substance the nome
     */
    public void setSubstance(String substance) {
        this.Substance = substance;
    }

    @Override
    public String toString() {
        return "Substance{" +
                "Substance='" + Substance + '\'' +
                '}';
    }
}