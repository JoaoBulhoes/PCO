import java.util.ArrayList;
import java.util.List;

/**
 * The type Handler pesquisa.
 */
public class HandlerPesquisa {

    private FoodTypeList foodTypeList;
    private FoodInteracionList foodInteractionList;
    private SubstancesList substancesList;
    private DrugList drugList;
    private LaboratoriesList laboratoriesList;

    public HandlerPesquisa(FoodTypeList foodTypeList, FoodInteracionList foodInteractionList, SubstancesList substancesList, DrugList drugList, LaboratoriesList laboratoriesList) {
        this.foodTypeList = foodTypeList;
        this.foodInteractionList = foodInteractionList;
        this.substancesList = substancesList;
        this.drugList = drugList;
        this.laboratoriesList = laboratoriesList;
    }

    public List<Laboratory> searchLaboratories(String survaillance) {
        List<Laboratory> result = new ArrayList<>();
        List<Laboratory> list = laboratoriesList.getList();
        for (Laboratory laboratory : list) {
            if (laboratory.getSurveillances().contains(survaillance)){
                result.add(laboratory);
            }
        }

        return result;
    }
    
    public List<FoodInteraction> searchFoodInteractions(String substance) {
        List<FoodInteraction> result = new ArrayList<>();
        List<FoodInteraction> list = foodInteractionList.getList();
        for (FoodInteraction interaction : list) {
            if (interaction.getSubstances().contains(substance)) {
                result.add(interaction);
            }
        }

        return result;
    }

    /**
     * Pedir mais substancias.
     */
    public void pedirMaisSubstancias() {}

    /**
     * Pedir mais medicamentos.
     */
    public void pedirMaisMedicamentos() {}

    /**
     * Indicar nome interacoes alimentares.
     *
     * @param nome the nome
     */
    public void indicarNomeInteracoesAlimentares(String nome) {}

    /**
     * Indicar nome medicamentos.
     *
     * @param nome the nome
     */
    public void indicarNomeMedicamentos(String nome) {}

    /**
     * Selecionar interacao alimentar.
     *
     * @param interacao the interacao
     */
    public void selecionarInteracaoAlimentar(FoodInteraction interacao) {}

    /**
     * Cancelar pesquisa interacoes alimentares.
     */
    public void cancelarPesquisaInteracoesAlimentares() {}
}
