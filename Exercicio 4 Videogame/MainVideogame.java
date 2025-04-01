import java.util.ArrayList;
import java.util.Scanner;

public class MainVideogame {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        ArrayList<Jogador> listaJogadores = new ArrayList<>();

        int Escolha = 0;
        while (Escolha != 4) {
            System.out.println("====================================================================");
            System.out.println("Ola, aventureiro");
            System.out.println("1 : Registrar Jogador.");
            System.out.println("2 : Acessar jogadores registrados.");
            System.out.println("3 : Mudar nivel ou pontuação.");
            System.out.println("4 : Sair");
            Escolha = Leitor.nextInt();
            Leitor.nextLine();

            switch (Escolha) {
                case 1:
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
                        System.out.println("Jogador Registrado!");
                    }
                    break;
                case 2:
                    if (listaJogadores.isEmpty()) {
                        System.out.println("Nenhum jogador encontrado.");
                    } else {
                        System.out.println("Jogadores: ");
                        for (int i = 0; i < listaJogadores.size(); i++) {
                            System.out.println("-----------------");
                            System.out.println("Jogador " + (i + 1) + ":");
                            listaJogadores.get(i).exibirJogador();
                        }
                    }
                    break;
                case 3:
                    if (listaJogadores.isEmpty()) {
                        System.out.println("Nenhum jogador encontrado.");
                        break;
                    }
                    System.out.println("Escolha o jogador pelo número:");
                    for (int i = 0; i < listaJogadores.size(); i++) {
                        System.out.println((i + 1) + " - " + listaJogadores.get(i).getNome());
                    }
                    int escolhaJogador = Leitor.nextInt() - 1;
                    if (escolhaJogador >= 0 && escolhaJogador < listaJogadores.size()) {
                        Jogador jogadorSelecionado = listaJogadores.get(escolhaJogador);
                        System.out.println("1: Aumentar Nível");
                        System.out.println("2: Aumentar Pontuação");
                        int escolhaAlteracao = Leitor.nextInt();
                        if (escolhaAlteracao == 1) {
                            jogadorSelecionado.aumentarNivel(Leitor);
                        } else if (escolhaAlteracao == 2) {
                            jogadorSelecionado.aumentarPontuacao(Leitor);
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Jogador inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        Leitor.close();
    }
}