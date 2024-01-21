import java.util.ArrayList;
import java.util.List;

/**
 * The type Interacao alimentar.
 */
public class FoodInteraction {
    private String Bibliography;
    private String Effect;
    private int EffectLevel;
    private String Explanation;
    private String Food;
    private String Substances;

    public FoodInteraction(String bibliography, String effect, int effectLevel, String explanation, String food, String substances) {
        Bibliography = bibliography;
        Effect = effect;
        EffectLevel = effectLevel;
        Explanation = explanation;
        Food = food;
        Substances = substances;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getBibliography() {
        return Bibliography;
    }

    /**
     * Sets nome.
     *
     * @param bibliography the nome
     */
    public void setBibliography(String bibliography) {
        this.Bibliography = bibliography;
    }

    /**
     * Gets explicacao.
     *
     * @return the explicacao
     */
    public String getExplanation() {
        return Explanation;
    }

    /**
     * Sets explicacao.
     *
     * @param explanation the explicacao
     */
    public void setExplanation(String explanation) {
        this.Explanation = explanation;
    }

    /**
     * Gets efeito.
     *
     * @return the efeito
     */
    public String getEffect() {
        return Effect;
    }

    /**
     * Sets efeito.
     *
     * @param effect the efeito
     */
    public void setEffect(String effect) {
        this.Effect = effect;
    }

    /**
     * Gets alimentos.
     *
     * @return the alimentos
     */
    public String getFood() {
        return Food;
    }

    /**
     * Sets alimento.
     *
     * @param Food alimentos
     */
    public void setAlimento(String Food) {
        this.Food = Food;
    }

    @Override
    public String toString() {
        return "FoodInteraction{" +
                "Bibliography='" + Bibliography + '\'' +
                ", Effect='" + Effect + '\'' +
                ", EffectLevel=" + EffectLevel +
                ", Explanation='" + Explanation + '\'' +
                ", Food='" + Food + '\'' +
                ", Substances='" + Substances + '\'' +
                '}';
    }
}
