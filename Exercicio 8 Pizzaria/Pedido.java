import java.util.List;

public class Pedido {
    private static int contador = 1;
    private int id;
    private Pizza pizza;
    private String endereco;

    public Pedido(Pizza pizza, String endereco) {
        this.id = contador++;
        this.pizza = pizza;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getEndereco() {
        return endereco;
    }

    public String toString() {
        return "Pedido " + id + ": " + pizza.getNome() + " (" + pizza.getTamanho() + ") - Entrega: " + endereco;
    }
}