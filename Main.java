import java.util.Scanner;

public class Main {
    private static final Sistema s = new Sistema();
    private static final Scanner scanner = new Scanner(System.in);

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
                    s.searchLaboratories();
                    break;
                case 5:
                    s.searchLaboratories();
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
                    s.searchLaboratories();
                    break;
                case 5:
                    s.searchLaboratories();
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
                    s.searchLaboratories();
                    break;
                case 5:
                    s.searchLaboratories();
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

    private static void validateGeral(int opcao) {
            switch (opcao) {
                case 1:
                    s.searchFoodInteractions();
                    break;
                case 2:
                    s.searchLaboratories();
                    break;
                case 3:
                    s.registerUser();
                    break;
                case 4:
                    // so para nao dar erro quando escolher o login
                    break;
                case 0:
                    System.out.println("Saindo do programa. Obrigado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
    }

}
