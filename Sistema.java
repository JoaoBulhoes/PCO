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
}

