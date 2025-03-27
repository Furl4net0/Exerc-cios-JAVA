import java.util.Scanner;
class Jogador {
    private String nome;
    private float pontuacao;
    private int nivel;

    public Jogador(String nome, float pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void aumentarNivel(Scanner Leitor) {
        System.out.print("Novo nível (deve ser maior que " + nivel + "): ");
        int novoNivel = Leitor.nextInt();
        if (novoNivel > nivel) {
            this.nivel = novoNivel;
            System.out.println("Nível atualizado com sucesso!");
        } else {
            System.out.println("O nível deve ser maior que o atual.");
        }
    }

    public void aumentarPontuacao(Scanner Leitor) {
        System.out.print("Nova pontuação (deve ser maior que " + pontuacao + "): ");
        float novaPontuacao = Leitor.nextFloat();
        if (novaPontuacao > pontuacao) {
            this.pontuacao = novaPontuacao;
            System.out.println("Pontuação atualizada com sucesso!");
        } else {
            System.out.println("A pontuação deve ser maior que a atual.");
        }
    }

    public void exibirJogador() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}
