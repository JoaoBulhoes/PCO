import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nome;
    private String formaFarmaceutica;
    private String dosagem;
    private List<SubstanciaAtiva> substancias = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public List<SubstanciaAtiva> getSubstancias() {
        return substancias;
    }

    public void setSubstancias(List<SubstanciaAtiva> substancias) {
        this.substancias = substancias;
    }
}
