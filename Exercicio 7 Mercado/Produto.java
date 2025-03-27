import java.util.ArrayList;

public class Produto {
    private String Nome;
    private String Codigo;
    private float Preco;
    private int QuantidadeEstoque;

    public Produto(String Nome, String Codigo, float Preco, int QuantidadeEstoque) {
        this.Nome = Nome;
        this.Codigo = Codigo;
        this.Preco = Preco;
        this.QuantidadeEstoque = QuantidadeEstoque;
    }

    public String MostrarNome() {
        return Nome;
    }

    public void NovoNome(String Nome) {
        this.Nome = Nome;
    }

    public String MostrarCodigo() {
        return Codigo;
    }

    public float MostrarPreco() {
        return Preco;
    }

    public void NovoPreco(float Preco) {
        this.Preco = Preco;
    }

    public int MostrarQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void NovoQuantidadeEstoque(int QuantidadeEstoque) {
        this.QuantidadeEstoque = QuantidadeEstoque;
    }

    public float CalcularValorTotal() {
        return Preco * QuantidadeEstoque;
    }


    public static Produto EncontrarProduto(String Codigo, ArrayList<Produto> Estoque) {
        for (int i = 0; i < Estoque.size(); i++) {
            Produto P = Estoque.get(i);
            if (P.MostrarCodigo().equals(Codigo)) {
                return P;
            }
        }
        return null;
    }
}
