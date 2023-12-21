import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i <= interacaoAlimentares.size(); i++) {
                System.out.format("%s - %s", i, interacaoAlimentares.get(i));
            }

            System.out.print("Escolha uma interacao alimentar: ");
            int selected = scan.nextInt();
            interacaoAlimentaresSelecionadas.add(interacaoAlimentares.get(selected));

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

    public String indicarForma(Scanner scan) {
        System.out.print("Introduza a forma farmaceutica: ");
        String formaFarmaceutica = scan.nextLine();

        while (formaFarmaceutica.length() == 0) {
            System.out.print("Erro, a forma não pode ficar vazia, introduza de novo: ");
            formaFarmaceutica = scan.nextLine();
        }

        return formaFarmaceutica;
    }
    public String indicarDosagem(Scanner scan) {
        System.out.print("Introduza a dosagem: ");
        String dosagem = scan.nextLine();

        while (dosagem.length() == 0) {
            System.out.print("Erro, a dosagem não pode ficar vazia, introduza de novo: ");
            dosagem = scan.nextLine();
        }

        return dosagem;
    }
    public void confirmarCriacaoMedicamento() {}
    public void cancelarCriacaoMedicamento() {}

    public void confirmarCriacaoSubstancia() {}
    public void cancelarCriacaoSubstancia() {}

    public String indicarExplicacao(Scanner scan) {
        System.out.print("Introduza a explicacao: ");
        String explicacao = scan.nextLine();

        while (explicacao.length() == 0) {
            System.out.print("Erro, a explicacao não pode ficar vazia, introduza de novo: ");
            explicacao = scan.nextLine();
        }

        return explicacao;
    }

    public List<Alimento> indicarAlimento(Scanner scan) {
        List<Alimento> alimentosSelecionados = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i <= alimentos.size(); i++) {
                System.out.format("%s - %s", i, alimentos.get(i));
            }

            System.out.print("Escolha um alimento: ");
            int selected = scan.nextInt();
            alimentosSelecionados.add(alimentos.get(selected));

            System.out.print("Deseja continuar a indicar alimentos? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("y") || option.toLowerCase().equals("yes")) {
                exit = true;
            }
        }

        return alimentosSelecionados;
    }

    public List<SubstanciaAtiva> indicarSubstancia(Scanner scan) {
        List<SubstanciaAtiva> substanciaAtivasSelecionadas = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            for (int i = 0; i <= substanciaAtivas.size(); i++) {
                System.out.format("%s - %s", i, substanciaAtivas.get(i));
            }

            System.out.print("Escolha uma substancia ativa: ");
            int selected = scan.nextInt();
            substanciaAtivasSelecionadas.add(substanciaAtivas.get(selected));

            System.out.print("Deseja continuar a indicar substancias ativas? s/n: ");
            String option = scan.nextLine();

            if (option.toLowerCase().equals("y") || option.toLowerCase().equals("yes")) {
                exit = true;
            }
        }

        return substanciaAtivasSelecionadas;
    }
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

    public void addAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    public void addMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
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