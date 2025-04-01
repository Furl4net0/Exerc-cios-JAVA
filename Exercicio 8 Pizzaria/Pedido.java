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

    public Pizza getPizza() {
        return pizza;
    }

    public String toString() {
        return "Pedido " + id + ": " + pizza.getNome() + " (" + pizza.getTamanho() + ") - Entrega: " + endereco;
    }
}