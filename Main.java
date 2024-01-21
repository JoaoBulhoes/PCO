import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema s = new Sistema();
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção (0 para sair): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    s.viewDrugs();
                    break;
                case 2:
                    s.viewSubstances();
                    break;

                case 3:
                    s.viewFoodInteractions();
                    break;

                case 4:
                    s.createSubstance();
                    break;

                case 5:
                    s.createDrug();
                    break;

                case 6:
                    s.createFoodInteraction();
                    break;

                case 7:
                    s.searchFoodInteractions();
                    break;

                case 8:
                    s.searchLaboratories();

                case 0:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Consultar Medicamentos");
        System.out.println("2. Consultar Substâncias");
        System.out.println("3. Consultar Interações Alimentares");
        System.out.println("4. Criar Substância Ativa");
        System.out.println("5. Criar Medicamento");
        System.out.println("6. Criar Interação Alimentar");
        System.out.println("7. Pesquisar Interação Alimentar");
        System.out.println("8. Pesquisar Contacto de Farmacovigilância");
        System.out.println("0. Sair");
    }

}
