public class Jogador {
    private String nome;
    private float pontuacao;
    private int nivel;

    public Jogador(String nome, float pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void AumentarNivel() {
            // Usuario escolhe personagem pelo indice do array
            // e escolhe valor que só pode ser maior que o numero ja adicionado,
            //pois nivel nao se perde

    }
    public void AumentarPontuacao() {
        //Mesma coisa aqui
    }


    public void exibirJogadores() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nivel: " + nivel);
    }



}
