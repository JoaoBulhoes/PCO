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
