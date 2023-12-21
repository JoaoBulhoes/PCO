import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.WeakHashMap;

public class HandlerCriacao {
    private List<Alimento> alimentos = new ArrayList<>();
    private List<InteracaoAlimentar> interacaoAlimentares = new ArrayList<>();
    private List<SubstanciaAtiva> substanciaAtivas = new ArrayList<>();
    private List<Medicamento> medicamentos = new ArrayList<>();

    public HandlerCriacao() {
        // carregr medicamentos
        // carregar interacoes alimentares
        // carregar substancias ativas
        // carregar alimentos
    }

    public String indicarNome(Scanner scan) {
        System.out.print("Introduza o nome: ");
        String nome = scan.nextLine();

        while (nome.length() == 0) {
            System.out.print("Erro, o nome não pode ficar vazio, introduza de novo: ");
            nome = scan.nextLine();
        }

        return nome;
    }

    public List<InteracaoAlimentar> indicarInteracao(Scanner scan) {
        List<InteracaoAlimentar> interacaoAlimentaresSelecionadas = new ArrayList<>();

        for (int i = 0; i <= interacaoAlimentares.size(); i++) {
            System.out.format("%s - %s", i, interacaoAlimentares.get(i));
        }

        int selected = scan.nextInt();
        interacaoAlimentaresSelecionadas.add(interacaoAlimentares.get(selected));

        boolean exit = false;
        while (!exit) {
            System.out.print("Deseja continuar a indicar interaçoes alimentares? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("y") || option.toLowerCase().equals("yes")) {
                exit = true;
            }
        }

        return interacaoAlimentaresSelecionadas;
    }

    public boolean confirmarCriacao(Scanner scan) {
        System.out.print("Confirma a criacao? y/n: ");
        String option = scan.nextLine();

        return option.toLowerCase().equals("y") || option.toLowerCase().equals("yes");
    }

    public void indicarPassword(String password) {}
    public void indicarEmail(String Email) {}
    public void indicarPapel(String papel) {}
    public void indicarContacto(String contacto) {}
    public void confirmarCriacaoUtilizador() {}
    public void cancelarCriacaoUtilizador() {}

    public void indicarForma(String forma) {}
    public void indicarDosagem(String dosagem) {}
    public void confirmarCriacaoMedicamento() {}
    public void cancelarCriacaoMedicamento() {}

    public void confirmarCriacaoSubstancia() {}
    public void cancelarCriacaoSubstancia() {}

    public void indicarExplicacao(String explicacao) {}
    public void indicarAlimento(Alimento alimento) {}
    public void indicarEfeito(String efeito) {}
    public void indicarReferencia(String referencia) {}
    public void confirmarCriacaoInteracao() {}
    public void cancelarCriacaoInteracao() {}

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public List<InteracaoAlimentar> getInteracaoAlimentares() {
        return interacaoAlimentares;
    }

    public void addInteracaoAlimentares(InteracaoAlimentar interacao) {
        interacaoAlimentares.add(interacao);
    }

    public List<SubstanciaAtiva> getSubstanciaAtivas() {
        return substanciaAtivas;
    }

    public void addSubstanciaAtiva(SubstanciaAtiva substancia) {
        substanciaAtivas.add(substancia);
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}