import java.util.List;

public class InteracaoAlimentar {
    private String explicacao;
    private String efeito;
    private Alimento alimento;

    public InteracaoAlimentar(String explicacao, String efeito, Alimento alimento) {
        this.explicacao = explicacao;
        this.efeito = efeito;
        this.alimento = alimento;
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

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }
}
