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

    private HandlerCriacao handlerCriacao = new HandlerCriacao();
    private HandlerPesquisa handlerPesquisa = new HandlerPesquisa();

    /**
     * Criar medicamento.
     */
    public void criarMedicamento() {
        String nome = handlerCriacao.indicarNome(scanner);

        String formaFarmaceutica = handlerCriacao.indicarForma(scanner);

        String dosagem = handlerCriacao.indicarDosagem(scanner);

        List<SubstanciaAtiva> substancias = handlerCriacao.indicarSubstancia(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addMedicamento(new Medicamento(nome, formaFarmaceutica, dosagem, substancias));
        }
    }

    /**
     * Criar substancia ativa.
     */
    public void criarSubstanciaAtiva() {
        String nome = handlerCriacao.indicarNome(scanner);

        List<InteracaoAlimentar> interacoes = handlerCriacao.indicarInteracao(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addSubstanciaAtiva(new SubstanciaAtiva(nome, interacoes));
        }
    }

    /**
     * Criar interacao alimentar.
     */
    public void criarInteracaoAlimentar() {
        String nome = handlerCriacao.indicarNome(scanner);

        String explicacao = handlerCriacao.indicarExplicacao(scanner);
        String efeito = handlerCriacao.indicarEfeito(scanner);
        String referencia = handlerCriacao.indicarReferencia(scanner);

        List<Alimento> alimentos = handlerCriacao.indicarAlimento(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addInteracaoAlimentares(new InteracaoAlimentar(nome, explicacao, efeito, referencia, alimentos));
        }
    }

    /**
     * Criar alimento.
     */
    public void criarAlimento() {
        String nome = handlerCriacao.indicarNome(scanner);
        handlerCriacao.addAlimento(new Alimento(nome));
    }

    /**
     * Consultar substancias ativas.
     */
    public void consultarSubstanciasAtivas() {
        List<SubstanciaAtiva> substanciaAtivas = handlerCriacao.getSubstanciaAtivas();

        System.out.println("Lista de Substâncias Ativas: ");

        for (SubstanciaAtiva substanciaAtiva : substanciaAtivas) {
            System.out.println("Nome: " + substanciaAtiva.getNome());
            System.out.println("Lista de Interações Alimentares:");
            for (InteracaoAlimentar interacaoAlimentar : substanciaAtiva.getInteracoes()) {
                System.out.println("- " + interacaoAlimentar.getNome());
            }
        }
    }

    /**
     * Consultar interacoes alimentares.
     */
    public void consultarInteracoesAlimentares() {
        List<InteracaoAlimentar> interacoesAlimentares = handlerCriacao.getInteracaoAlimentares();

        System.out.println("Lista de Interações Alimentares: ");

        for (InteracaoAlimentar interacaoAlimentar : interacoesAlimentares) {
            System.out.println("Nome: " + interacaoAlimentar.getNome());
            System.out.println("Explicação: " + interacaoAlimentar.getExplicacao());
            System.out.println("Efeito: " + interacaoAlimentar.getEfeito());
            System.out.println("Lista de Alimentos:");
            for (Alimento alimento : interacaoAlimentar.getAlimentos()) {
                System.out.println("- " + alimento.getNome());
            }

        }
    }

    /**
     * Registar utilizador utilizador.
     *
     * @param utilizadores the utilizadores
     * @return the utilizador
     */
    public Utilizador registarUtilizador(List<Utilizador> utilizadores) {

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

