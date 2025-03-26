import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        ArrayList<Jogador> listaJogadores= new ArrayList<>();

        int Escolha = 0;
        while (Escolha != 4) {
            System.out.println("====================================================================");
            System.out.println("Ola, aventureiro");
            System.out.println("1 : Registrar Jogador.");
            System.out.println("2 : Acessar jogadores registrados.");
            System.out.println("3 : Mudar nivel ou pontuação.");
            // Criar metodo pra escolher jogador e escolher entre nivel ou pontuação
            System.out.println("4 : Sair");
            Escolha = Leitor.nextInt();
            Leitor.nextLine();

            // Mudar pra Switch aqui pois são 4 escolhas agora

            if (Escolha == 1) {
                System.out.print("Digite o numero de jogadores: ");
                int numJogadores = Leitor.nextInt();
                Leitor.nextLine();

                for (int i = 0; i < numJogadores; i++) {
                    System.out.println("\n Jogador " + (i + 1) + ":");
                    System.out.print("Nome: ");
                    String nome = Leitor.nextLine();
                    System.out.print("Nivel: ");
                    int nivel = Leitor.nextInt();
                    System.out.print("Pontuação: ");
                    float pontuacao = Leitor.nextFloat();
                    Leitor.nextLine();

                    Jogador jogador = new Jogador(nome, pontuacao, nivel);
                    listaJogadores.add(jogador);
                    System.out.println("Livro Registrado!");
                }
            } else if (Escolha == 2) {
                if (listaJogadores.isEmpty()) {
                    System.out.println("Nenhum jogador encontrado.");
                } else {
                    System.out.println("Jogadores: ");
                    for (int i = 0; i < listaJogadores.size(); i++) {
                        System.out.println("Jogador " + (i + 1) + ":");
                        listaJogadores.get(i).exibirJogadores();
                    }
                }
            }
        }
        Leitor.close();
    }
}