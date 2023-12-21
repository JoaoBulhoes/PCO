import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.WeakHashMap;

public class HandlerCriacao {
    public String indicarNome(Scanner scan) {
        System.out.print("Introduza o nome: ");
        String nome = scan.nextLine();

        while (nome.length() == 0) {
            System.out.print("Erro, o nome não pode ficar vazio, introduza de novo: ");
            nome = scan.nextLine();
        }

        return nome;
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
}
