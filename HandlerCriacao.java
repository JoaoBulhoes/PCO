import java.util.List;
import java.util.Scanner;

public class HandlerCriacao {
    private FoodTypeList foodTypeList;
    private FoodInteracionList foodInteractionList;
    private SubstancesList substancesList;
    private DrugList drugList;
    private LaboratoriesList laboratoriesList;

    public HandlerCriacao(FoodTypeList foodTypeList, FoodInteracionList foodInteractionList, SubstancesList substancesList, DrugList drugList, LaboratoriesList laboratoriesList) {
        this.foodTypeList = foodTypeList;
        this.foodInteractionList = foodInteractionList;
        this.substancesList = substancesList;
        this.drugList = drugList;
        this.laboratoriesList = laboratoriesList;
    }

    public String insertName(Scanner scan) {
        System.out.print("Introduza o nome: ");
        String name = scan.nextLine();

        while (name.length() == 0) {
            System.out.print("Erro, o nome não pode ficar vazio, introduza de novo: ");
            name = scan.nextLine();
        }

        return name;
    }

    public String insertNameLaboratory(Scanner scan) {
        System.out.print("Introduza o nome do laboratório: ");
        String name = scan.nextLine();

        while (name.length() == 0) {
            System.out.print("Erro, o nome não pode ficar vazio, introduza de novo: ");
            name = scan.nextLine();
        }

        return name;
    }

    public String insertNameSubstance(Scanner scan) {
        System.out.print("Introduza o nome das substâncias: ");
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
                System.out.format("%s - %s\n", i, foodTypeList.get(i));
            }

            System.out.print("\nEscolha uma interacao alimentar: ");
            int selected = Integer.parseInt(scan.nextLine());
            System.out.println("");

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

    public String insertExplanation(Scanner scan) {
        System.out.print("Introduza a explicação: ");
        String explanation = scan.nextLine();

        while (explanation.length() == 0) {
            System.out.print("Erro, a explicação não pode ficar vazia, introduza de novo: ");
            explanation = scan.nextLine();
        }

        return explanation;
    }

    public String insertSubstance(Scanner scan) {
        StringBuilder selectedSubstances = new StringBuilder();

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i < substancesList.size(); i++) {
                System.out.format("%s - %s\n", i, substancesList.get(i));
            }

            System.out.print("\nEscolha uma substancia ativa: ");
            int selected = Integer.parseInt(scan.nextLine());
            System.out.println("");

            selectedSubstances.append(substancesList.get(selected).getSubstance()).append("|");

            System.out.print("Deseja continuar a indicar substancias ativas? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("n") || option.toLowerCase().equals("nao")) {
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

    public String insertEffectLevel(Scanner scan) {
        System.out.print("Introduza o nivel do efeito: ");
        return scan.nextLine();
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
            for (int i = 0; i < foodTypeList.size(); i++) {
                System.out.format("%s - %s\n", i, foodTypeList.get(i));
            }

            System.out.print("\nEscolha um tipo de alimento: ");
            int selected = Integer.parseInt(scan.nextLine());
            System.out.println("");

            selectedFoods.append(foodTypeList.get(selected).getType()).append("|");

            System.out.print("Deseja continuar a indicar tipos de alimentos? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("n") || option.toLowerCase().equals("nao")) {
                exit = true;
            }
        }

        return selectedFoods.toString();
    }
}