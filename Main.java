import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção (0 para sair): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pesquisarMedicamentos();
                    break;
                case 2:
                    pesquisarSubstancias();
                    break;
                case 3:
                    interacoesAlimentares();
                    break;
                // Adicione mais cases conforme necessário para outras opções

                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Pesquisar Medicamentos");
        System.out.println("2. Pesquisar Substâncias");
        System.out.println("3. Interações Alimentares");
        // Adicione mais opções de menu conforme necessário
        System.out.println("0. Sair");
    }

    private static void pesquisarMedicamentos() {
        System.out.println("Executando pesquisa de medicamentos...");
        // Adicione lógica específica para a opção 1
    }

    private static void pesquisarSubstancias() {
        System.out.println("Executando pesquisa de substâncias...");
        // Adicione lógica específica para a opção 2
    }

    private static void interacoesAlimentares() {
        System.out.println("Executando pesquisa de interações alimentares...");
        // Adicione lógica específica para a opção 3
    }

    // Adicione mais métodos conforme necessário para outras opções do menu
}
