import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private final Scanner scanner = new Scanner(System.in);

    private List<Utente> utentes = new ArrayList<>();
    private List<Utilizador> utilizadores = new ArrayList<>();

    private HandlerCriacao handlerCriacao = new HandlerCriacao();
    private HandlerPesquisa handlerPesquisa = new HandlerPesquisa();

    public void criarSubstanciaAtiva() {
        String nome = handlerCriacao.indicarNome(scanner);

        List<InteracaoAlimentar> interacoes = handlerCriacao.indicarInteracao(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addSubstanciaAtiva(new SubstanciaAtiva(nome, interacoes));
        }
    }

    public void criarInteracaoAlimentar() {
        String nome = handlerCriacao.indicarNome(scanner);

        String explicacao = handlerCriacao.indicarExplicacao(scanner);

        Alimento alimento = handlerCriacao.indicarAlimento(scanner);

        if (handlerCriacao.confirmarCriacao(scanner)) {
            handlerCriacao.addInteracaoAlimentares(new InteracaoAlimentar(nome, explicacao, alimento));
        }
    }

    public void criarAlimento() {
        String nome = handlerCriacao.indicarNome(scanner);
        handlerCriacao.addAlimento(new Alimento(nome));
    }

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
}

