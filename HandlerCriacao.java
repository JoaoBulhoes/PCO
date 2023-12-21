import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Handler criacao.
 */
public class HandlerCriacao {
    private List<Alimento> alimentos = new ArrayList<>();
    private List<InteracaoAlimentar> interacaoAlimentares = new ArrayList<>();
    private List<SubstanciaAtiva> substanciaAtivas = new ArrayList<>();
    private List<Medicamento> medicamentos = new ArrayList<>();

    /**
     * Instantiates a new Handler criacao.
     */
    public HandlerCriacao() {
        // carregr medicamentos
        // carregar interacoes alimentares
        // carregar substancias ativas
        // carregar alimentos
    }

    /**
     * Indicar nome string.
     *
     * @param scan the scan
     * @return the string
     */
    public String indicarNome(Scanner scan) {
        System.out.print("Introduza o nome: ");
        String nome = scan.nextLine();

        while (nome.length() == 0) {
            System.out.print("Erro, o nome não pode ficar vazio, introduza de novo: ");
            nome = scan.nextLine();
        }

        return nome;
    }

    /**
     * Indicar interacao list.
     *
     * @param scan the scan
     * @return the list
     */
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

    /**
     * Confirmar criacao boolean.
     *
     * @param scan the scan
     * @return the boolean
     */
    public boolean confirmarCriacao(Scanner scan) {
        System.out.print("Confirma a criacao? y/n: ");
        String option = scan.nextLine();

        return option.toLowerCase().equals("y") || option.toLowerCase().equals("yes");
    }

    /**
     * Indicar password.
     *
     * @param password the password
     */
    public void indicarPassword(String password) {
    }

    /**
     * Indicar email.
     *
     * @param Email the email
     */
    public void indicarEmail(String Email) {
    }

    /**
     * Indicar papel.
     *
     * @param papel the papel
     */
    public void indicarPapel(String papel) {
    }

    /**
     * Indicar contacto.
     *
     * @param contacto the contacto
     */
    public void indicarContacto(String contacto) {
    }

    /**
     * Confirmar criacao utilizador.
     */
    public void confirmarCriacaoUtilizador() {
    }

    /**
     * Cancelar criacao utilizador.
     */
    public void cancelarCriacaoUtilizador() {
    }

    /**
     * Indicar forma string.
     *
     * @param scan the scan
     * @return the string
     */
    public String indicarForma(Scanner scan) {
        System.out.print("Introduza a forma farmaceutica: ");
        String formaFarmaceutica = scan.nextLine();

        while (formaFarmaceutica.length() == 0) {
            System.out.print("Erro, a forma não pode ficar vazia, introduza de novo: ");
            formaFarmaceutica = scan.nextLine();
        }

        return formaFarmaceutica;
    }

    /**
     * Indicar dosagem string.
     *
     * @param scan the scan
     * @return the string
     */
    public String indicarDosagem(Scanner scan) {
        System.out.print("Introduza a dosagem: ");
        String dosagem = scan.nextLine();

        while (dosagem.length() == 0) {
            System.out.print("Erro, a dosagem não pode ficar vazia, introduza de novo: ");
            dosagem = scan.nextLine();
        }

        return dosagem;
    }

    /**
     * Confirmar criacao medicamento.
     */
    public void confirmarCriacaoMedicamento() {
    }

    /**
     * Cancelar criacao medicamento.
     */
    public void cancelarCriacaoMedicamento() {
    }

    /**
     * Confirmar criacao substancia.
     */
    public void confirmarCriacaoSubstancia() {
    }

    /**
     * Cancelar criacao substancia.
     */
    public void cancelarCriacaoSubstancia() {
    }

    /**
     * Indicar explicacao string.
     *
     * @param scan the scan
     * @return the string
     */
    public String indicarExplicacao(Scanner scan) {
        System.out.print("Introduza a explicacao: ");
        String explicacao = scan.nextLine();

        while (explicacao.length() == 0) {
            System.out.print("Erro, a explicacao não pode ficar vazia, introduza de novo: ");
            explicacao = scan.nextLine();
        }

        return explicacao;
    }

    /**
     * Indicar alimento list.
     *
     * @param scan the scan
     * @return the list
     */
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

    /**
     * Indicar substancia list.
     *
     * @param scan the scan
     * @return the list
     */
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

    /**
     * Indicar efeito.
     *
     * @param efeito the efeito
     */
    public void indicarEfeito(String efeito) {}

    /**
     * Indicar referencia.
     *
     * @param referencia the referencia
     */
    public void indicarReferencia(String referencia) {}

    /**
     * Confirmar criacao interacao.
     */
    public void confirmarCriacaoInteracao() {}

    /**
     * Cancelar criacao interacao.
     */
    public void cancelarCriacaoInteracao() {}

    /**
     * Gets alimentos.
     *
     * @return the alimentos
     */
    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    /**
     * Gets interacao alimentares.
     *
     * @return the interacao alimentares
     */
    public List<InteracaoAlimentar> getInteracaoAlimentares() {
        return interacaoAlimentares;
    }

    /**
     * Add interacao alimentares.
     *
     * @param interacao the interacao
     */
    public void addInteracaoAlimentares(InteracaoAlimentar interacao) {
        interacaoAlimentares.add(interacao);
    }

    /**
     * Add alimento.
     *
     * @param alimento the alimento
     */
    public void addAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    /**
     * Add medicamento.
     *
     * @param medicamento the medicamento
     */
    public void addMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    /**
     * Gets substancia ativas.
     *
     * @return the substancia ativas
     */
    public List<SubstanciaAtiva> getSubstanciaAtivas() {
        return substanciaAtivas;
    }

    /**
     * Add substancia ativa.
     *
     * @param substancia the substancia
     */
    public void addSubstanciaAtiva(SubstanciaAtiva substancia) {
        substanciaAtivas.add(substancia);
    }

    /**
     * Gets medicamentos.
     *
     * @return the medicamentos
     */
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}