import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contato> contatos;
    private static final Scanner Leitor = new Scanner(System.in);

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = Leitor.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = Leitor.nextLine();
        contatos.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado com sucesso!");
    }

    public void buscarContato() {
        System.out.print("Digite o nome do contato que deseja buscar: ");
        String nomeBusca = Leitor.nextLine();
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                contato.exibirContato();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void removerContato() {
        System.out.print("Digite o nome do contato que deseja remover: ");
        String nomeRemove = Leitor.nextLine();
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nomeRemove)) {
                contatos.remove(i);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}
