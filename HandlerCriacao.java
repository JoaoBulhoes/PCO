import java.util.List;
import java.util.Scanner;

public class HandlerCriacao {
    private FoodTypeList foodTypeList = new FoodTypeList();
    private FoodInteracionList foodInteractionList = new FoodInteracionList();
    private SubstancesList substancesList = new SubstancesList();
    private DrugList drugList = new DrugList();

    public String insertName(Scanner scan) {
        System.out.print("Introduza o nome: ");
        String name = scan.nextLine();

        while (name.length() == 0) {
            System.out.print("Erro, o nome não pode ficar vazio, introduza de novo: ");
            name = scan.nextLine();
        }

        return name;
    }

    public String indicarInteracao(Scanner scan) {
        StringBuilder selectedFoodInteractions = new StringBuilder();

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i <= foodTypeList.size(); i++) {
                System.out.format("%s - %s", i, foodTypeList.get(i));
            }

            System.out.print("Escolha uma interacao alimentar: ");
            int selected = scan.nextInt();
            selectedFoodInteractions.append(foodTypeList.get(selected).getType()).append("|");

            System.out.print("Deseja continuar a indicar interaçoes alimentares? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("y") || option.toLowerCase().equals("yes")) {
                exit = true;
            }
        }

        return selectedFoodInteractions.toString();
    }

    public boolean confirmarCriacao(Scanner scan) {
        System.out.print("Confirma a criacao? y/n: ");
        String option = scan.nextLine();

        return option.toLowerCase().equals("y") || option.toLowerCase().equals("yes");
    }

    public void indicarPassword(String password) {
    }

    public void indicarEmail(String Email) {
    }

    public void indicarPapel(String papel) {
    }

    public void indicarContacto(String contacto) {
    }

    public void confirmarCriacaoUtilizador() {
    }

    public void cancelarCriacaoUtilizador() {
    }

    public String indicarForma(Scanner scan) {
        System.out.print("Introduza a forma farmaceutica: ");
        String form = scan.nextLine();

        while (form.length() == 0) {
            System.out.print("Erro, a forma não pode ficar vazia, introduza de novo: ");
            form = scan.nextLine();
        }

        return form;
    }

    public String insertDosage(Scanner scan) {
        System.out.print("Introduza a dosagem: ");
        String dosage = scan.nextLine();

        while (dosage.length() == 0) {
            System.out.print("Erro, a dosagem não pode ficar vazia, introduza de novo: ");
            dosage = scan.nextLine();
        }

        return dosage;
    }

    public String inserExplanation(Scanner scan) {
        System.out.print("Introduza a explicacao: ");
        String explanation = scan.nextLine();

        while (explanation.length() == 0) {
            System.out.print("Erro, a explicacao não pode ficar vazia, introduza de novo: ");
            explanation = scan.nextLine();
        }

        return explanation;
    }

    public String insertSubstance(Scanner scan) {
        StringBuilder selectedSubstances = new StringBuilder();

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i <= substancesList.size(); i++) {
                System.out.format("%s - %s", i, substancesList.get(i));
            }

            System.out.print("Escolha uma substancia ativa: ");
            int selected = scan.nextInt();
            selectedSubstances.append(substancesList.get(selected).getSubstance()).append("|");

            System.out.print("Deseja continuar a indicar substancias ativas? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("y") || option.toLowerCase().equals("yes")) {
                exit = true;
            }
        }

        return selectedSubstances.toString();
    }

    public String insertEffect(Scanner scan) {
        System.out.print("Introduza o efeito: ");
        String effect = scan.nextLine();

        while (effect.length() == 0) {
            System.out.print("Erro, o efeito não pode ficar vazio, introduza de novo: ");
            effect = scan.nextLine();
        }

        return effect;
    }

    public void confirmarCriacaoInteracao() {
    }

    public void cancelarCriacaoInteracao() {
    }

    public List<FoodType> getFoodTypeList() {
        return foodTypeList.getList();
    }

    public List<FoodInteraction> getFoodInteractionList() {
        return foodInteractionList.getList();
    }

    public void addFoodInteraction(FoodInteraction interacao) {
        foodInteractionList.add(interacao);
    }

    public void addFoodType(FoodType foodType) {
        foodTypeList.add(foodType);
    }

    public void addDrug(Drug drug) {
        drugList.add(drug);
    }

    public List<Substance> getSubstancesList() {
        return substancesList.getList();
    }

    public void addSubstance(Substance substancia) {
        substancesList.add(substancia);
    }

    public List<Drug> getDrugList() {
        return drugList.getList();
    }

    public int insertEffectLevel(Scanner scan) {
        return scan.nextInt();
    }

    public String insertBibliography(Scanner scan) {
        System.out.print("Introduza a Bibliografia: ");
        String bibliography = scan.nextLine();

        while (bibliography.length() == 0) {
            System.out.print("Erro, a Bibliografia não pode ficar vazia, introduza de novo: ");
            bibliography = scan.nextLine();
        }

        return bibliography;
    }

    public String insertFood(Scanner scan) {
        StringBuilder selectedFoods = new StringBuilder();

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i <= foodTypeList.size(); i++) {
                System.out.format("%s - %s", i, foodTypeList.get(i));
            }

            System.out.print("Escolha um tipo de alimento: ");
            int selected = scan.nextInt();
            selectedFoods.append(foodTypeList.get(selected).getType()).append("|");

            System.out.print("Deseja continuar a indicar tipos de alimentos? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("y") || option.toLowerCase().equals("yes")) {
                exit = true;
            }
        }

        return selectedFoods.toString();
    }
}