import java.util.ArrayList;
import java.util.List;

public class SubstanciaAtiva {
    private String nome;
    private List<InteracaoAlimentar> interacoes = new ArrayList<>();

    public SubstanciaAtiva(String nome, List<InteracaoAlimentar> interacoes) {
        this.nome = nome;
        this.interacoes = interacoes;
    }
}
