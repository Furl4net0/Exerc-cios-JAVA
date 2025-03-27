import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int escolha;

        do {
            System.out.println("Bem vindo a sua agenda!");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = Leitor.nextInt();
            Leitor.nextLine();

            switch (escolha) {
                case 1:
                    agenda.adicionarContato();
                    break;
                case 2:
                    agenda.buscarContato();
                    break;
                case 3:
                    agenda.removerContato();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (escolha != 4);
        Leitor.close();
    }
}
