import java.util.ArrayList;
import java.util.List;

public class InteracaoAlimentar {
    private String nome;
    private String explicacao;
    private String efeito;
    private List<Alimento> alimentos = new ArrayList<>();

    public InteracaoAlimentar(String explicacao, String efeito, List<Alimento> alimentos) {
        this.explicacao = explicacao;
        this.efeito = efeito;
        this.alimentos = alimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimento(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
}
