import java.util.List;

public class Pizza {
    private String nome;
    private double preco;
    private List<String> ingredientes;
    private String tamanho;

    public Pizza(String nome, double preco, List<String> ingredientes, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String toString() {
        return nome + " (" + tamanho + ") - R$ " + preco + " - Ingredientes: " + ingredientes;
    }
}