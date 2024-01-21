import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Sistema.
 */
public class Sistema {
    private final Scanner scanner = new Scanner(System.in);

    private List<Utente> utentes = new ArrayList<>();
    private List<Utilizador> utilizadores = new ArrayList<>();

    private HandlerCriacao handlerCriacao;
    private HandlerPesquisa handlerPesquisa;

    private FoodTypeList foodTypeList;
    private FoodInteracionList foodInteractionList;
    private SubstancesList substancesList;
    private DrugList drugList;
    private LaboratoriesList laboratoriesList;

    public Sistema() {
        foodTypeList = databaseImporter.importFoodTypes();
        foodInteractionList = databaseImporter.importFoodInteractions();
        substancesList = databaseImporter.importSubstances();
        drugList = databaseImporter.importDrugs();
        laboratoriesList = databaseImporter.importLaboratories();

        handlerCriacao = new HandlerCriacao(foodTypeList, foodInteractionList, substancesList, drugList, laboratoriesList);
        handlerPesquisa = new HandlerPesquisa(foodTypeList, foodInteractionList, substancesList, drugList, laboratoriesList);
    }

    public void searchFoodInteractions(){
        System.out.println(handlerPesquisa.searchFoodInteractions(scanner.nextLine()));
    }

    public void searchLaboratories(){
        System.out.println(handlerPesquisa.searchLaboratories(scanner.nextLine()));
    }

    /**
     * Criar medicamento.
     */
    public void createDrug() {
        String name = handlerCriacao.insertName(scanner);
        String form = handlerCriacao.indicarForma(scanner);
        String dosage = handlerCriacao.insertDosage(scanner);
        String laboratory = handlerCriacao.insertNameLaboratory(scanner);
        String substances = handlerCriacao.insertNameSubstance(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addDrug(new Drug(name, form, dosage, laboratory, substances));
        }
    }

    /**
     * Criar substancia ativa.
     */
    public void createSubstance() {
        String name = handlerCriacao.insertName(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addSubstance(new Substance(name));
        }
    }

    /**
     * Criar interacao alimentar.
     */
    public void createFoodInteraction() {
        String bibliography = handlerCriacao.insertBibliography(scanner);
        String effect = handlerCriacao.insertEffect(scanner);
        int effectLevel = handlerCriacao.insertEffectLevel(scanner);
        String explanation = handlerCriacao.inserExplanation(scanner);
        String food = handlerCriacao.insertFood(scanner);
        String substances = handlerCriacao.insertSubstance(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addFoodInteraction(new FoodInteraction(bibliography, effect, effectLevel, explanation, food, substances));
        }
    }

    /**
     * Criar alimento.
     */
    public void createFoodType() {
        String nome = handlerCriacao.insertName(scanner);
        handlerCriacao.addFoodType(new FoodType(nome));
    }

    /**
     * Consultar substancias ativas.
     */
    public void viewSubstances() {
        List<Substance> substances = handlerCriacao.getSubstancesList();

        System.out.println("Lista de Substâncias Ativas: ");

        for (Substance substance : substances) {
            System.out.println("Nome: " + substance.getSubstance());
        }
    }

    /**
     * Consultar interacoes alimentares.
     */
    public void viewFoodInteractions() {
        List<FoodInteraction> foodInteractions = handlerCriacao.getFoodInteractionList();

        System.out.println("Lista de Interações Alimentares: ");

        for (FoodInteraction foodInteraction : foodInteractions) {
            System.out.println("Nome: " + foodInteraction.getBibliography());
            System.out.println("Explicação: " + foodInteraction.getExplanation());
            System.out.println("Efeito: " + foodInteraction.getEffect());
            System.out.println("Lista de Alimentos:");
            for (String food : foodInteraction.getFood().split("\\|")) {
                System.out.println("- " + food);
            }

        }
    }

    public void viewDrugs() {
        List<Drug> drugs = handlerCriacao.getDrugList();

        System.out.println("Lista de Medicamentos: ");
        for (Drug drug : drugs) {
            System.out.println("Nome: " + drug.getName());
            System.out.println("Forma: " + drug.getForm());
            System.out.println("Dosagem: " + drug.getDosage());
            System.out.println("Laboratório: " + drug.getLaboratory());
            System.out.println("Substâncias: " + drug.getSubstances());
            System.out.println("");
        }
    }

    /**
     * Registar utilizador utilizador.
     *
     * @param utilizadores the utilizadores
     * @return the utilizador
     */
    public Utilizador registerUser(List<Utilizador> utilizadores) {

        System.out.println("Insera o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insera a sua password: ");
        String password = scanner.nextLine();
        System.out.println("Insera o seu email: ");
        String email;
        do {
            System.out.println();
            email =scanner.nextLine();

            if (emailAlreadyExists(email, utilizadores)) {
                System.out.println("Email já existe. Por favor escolha um email diferente.");
            }
        } while (emailAlreadyExists(email, utilizadores));

        System.out.println("Utilizador registado!");
        return new Utilizador(nome, password, email);
    }

    private static boolean emailAlreadyExists(String email, List<Utilizador> utilizadores) {
        for (Utilizador utilizador : utilizadores) {
            if (utilizador.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

}

