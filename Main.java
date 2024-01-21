import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("===== Menu =====");
            exibirMenuGeral();
            System.out.println("4. Efetuar Login");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            String role = "nao autenticado";
            if (opcao == 4) {
                role = s.login();
            }

            validateGeral(opcao);

            switch (role) {
                case "admin":
                    exibirMenuAdmin();
                    break;
                case "farma":
                    exibirMenuFarmeceutico();
                    break;
                case "industria":
                    exibirMenuIndustria();
                    break;
            }
        }
    }

    private static void exibirMenuAdmin() {
        while (true) {
            System.out.println("===== Menu do Administrador =====");
            exibirMenuGeral();
            System.out.println("4. Criar Substância Ativa");
            System.out.println("5. Consultar Substâncias");

            int opcao = scanner.nextInt();
            validateGeral(opcao);
            switch (opcao) {
                case 4:
                    s.createSubstance();
                    break;
                case 5:
                    s.viewSubstances();
                    break;
            }
        }
    }

    private static void exibirMenuFarmeceutico() {
        while (true) {
            System.out.println("===== Menu do Farmacêutico =====");
            exibirMenuGeral();
            System.out.println("4. Criar Interação Alimentar");
            System.out.println("5. Consultar Interações Alimentares");

            int opcao = scanner.nextInt();
            validateGeral(opcao);
            switch (opcao) {
                case 4:
                    s.createFoodInteraction();
                    break;
                case 5:
                    s.viewFoodInteractions();
                    break;
            }
        }
    }

    private static void exibirMenuIndustria() {
        while (true) {
            System.out.println("===== Menu da Indústria =====");
            exibirMenuGeral();
            System.out.println("4. Criar Medicamento");
            System.out.println("5. Consultar Interações Alimentares");

            int opcao = scanner.nextInt();
            validateGeral(opcao);
            switch (opcao) {
                case 4:
                    s.createDrug();
                    break;
                case 5:
                    s.viewDrugs();
                    break;
            }

        }
    }

    private static void exibirMenuGeral() {
        System.out.println("0. Sair");
        System.out.println("1. Pesquisar Interação Alimentar");
        System.out.println("2. Pesquisar Contacto de Farmacovigilância");
        System.out.println("3. Registar Utilizador");
    }

}
